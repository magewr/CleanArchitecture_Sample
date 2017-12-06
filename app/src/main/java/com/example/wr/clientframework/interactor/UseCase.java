package com.example.wr.clientframework.interactor;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by WR on 2017-11-30.
 */

public abstract class UseCase<T, Param> {
    private final CompositeDisposable disposables;

    protected UseCase() {
        this.disposables = new CompositeDisposable();
    }

    protected abstract Observable<T> buildUseCaseObservable(Param param);

    public void execute(DisposableObserver<T> observer, Param param) {
        if (observer != null) {
            final Observable<T> observable = this.buildUseCaseObservable(param)
                    .subscribeOn(Schedulers.io())
                    .repeatWhen(objectObservable -> objectObservable.delay(5, TimeUnit.SECONDS))
                    .observeOn(AndroidSchedulers.mainThread());
            addDisposable(observable.subscribeWith(observer));
        }
    }

    public void dispose() {
        if (!disposables.isDisposed())
            disposables.dispose();
    }

    private void addDisposable(Disposable disposable) {
        if (disposable != null && this.disposables != null)
            disposables.add(disposable);
    }


}