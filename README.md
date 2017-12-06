# ClientFramework
Splash image 출처 : https://dribbble.com/shots/1433198-Zuck-Dawg-making-it-rain

현재 지속적으로 작업중인 프로젝트입니다.


DI를 이용한 MVP패턴을 사용합니다.

http 통신 모듈로 Retrofit2 + OKHttp3를 사용하며 Json Parser로 Gson을 사용합니다.

RXJava2.0 를 적용하였습니다.

Repository와 Model 간의 Interactor에서 Google Clean Architecture의 가이드를 적용해보았습니다.

Presenter패키지와 data패키지 또한 Google Clean Architecture의 가이드대로 리팩토링 해볼 예정입니다.

그 이후 Kotlin으로 포팅작업 예정입니다.




# Sample UI

샘플 API는 http://doc.coinone.co.kr/#api-Public-Ticker 를 사용하였습니다.

샘플 앱으로 위에서 제공하는 API로 비트코인의 현재 가격을 5초마다 갱신하여 보여줍니다.

View의 오픈소스로 Glide, TickerView 사용하였습니다.

Glide : https://github.com/bumptech/glide

TickerView : https://github.com/robinhood/ticker

Splash image 출처 : https://dribbble.com/shots/1433198-Zuck-Dawg-making-it-rain
