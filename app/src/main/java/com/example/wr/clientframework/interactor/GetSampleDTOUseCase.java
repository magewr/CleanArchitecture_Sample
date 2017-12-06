package com.example.wr.clientframework.interactor;

import android.provider.ContactsContract;

import com.example.wr.clientframework.data.DataRepository;
import com.example.wr.clientframework.data.remote.dto.SampleDTO;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by WR on 2017-11-30.
 */

public class GetSampleDTOUseCase extends UseCase<SampleDTO, Void> {

    private DataRepository dataRepository;

    @Inject
    GetSampleDTOUseCase(DataRepository dataRepository) {
        super();
        this.dataRepository = dataRepository;
    }

    @Override
    protected Observable<SampleDTO> buildUseCaseObservable(Void aVoid) {
        return dataRepository.getSampleDto();
    }

}
