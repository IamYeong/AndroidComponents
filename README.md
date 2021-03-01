# AndroidComponents
Practicing components implementation and use

ㅁ4대 컴포넌트와 Room 라이브러리를 구현해본 프로젝트

ㅁ개요
- 안드로이드 프레임워크 까지 공부 중이었지만 정작 중요한 컴포넌트를 학습하지 않았기에
Activity, ContentProvider, BroadcastReceiver, Service. 그리고 이를 이어주는 Intent 로 구성했습니다.
Room라이브러리는 ContentProvider 에 local database 가 필요하여 SQLite 대신 활용해보았습니다.

ㅁActivity
- 1개 이상의 UI를 가지고 Lifecycle 에 따라 생성 및 소멸 되는 Component.
-->하위 개념으로 분할 구성 가능한 Fragment 도 있다. 별개의 프로젝트 보다는 추후
실제 프로젝트에 적용하면서 더 다양하게 활용해볼 예정(이미 todayLunch 프로젝트에서 Tablayout으로 활용해봄.)

ㅁService
- 안드로이드 프레임워크는 리눅스 커널을 기반으로 init 프로세스를 거쳐 여러 네이티브 서비스를 초기화 및 Context Manager 에 등록한다.
이후 Servie 컴포넌트와 같이 기기에 있는 기능을 사용할 수 있게 제공한다.
해당 프로젝트에서는 MediaPlayer를 통해 mp3 를 백그라운드에서 비동기 실행/중지 를 다뤄봤고, 별개의 Lifecycle 을 가진다.

ㅁBroadcastReceiver 
- 특정 Action이 발생됐을 때 Action을 감지해서 방송한다는 느낌이다.
마치 GoF Design Pattern 중 Observer 패턴과 비슷하다고 느꼈다.
해당 프로젝트에서는 Action을 모조리 구현해볼 수는 없으니
비행기 모드 설정/비설정 여부를 감지하여 Toast를 띄우도록 했다.

ㅁContentProvider
- 다른 앱에서 접근 가능한 인터페이스를 제공하는 Component 이다.
보통은 db에 접근한다는 것 같아서 처음 써보는 Room 라이브러리(이전엔 SQLite 사용)를 사용했기에
구현하는데 가장 힘이 들었다.
사실상 db만 구축해두면 각 CRUD 에 따라 메서드만 구현해두면 되는 거라서 Component 사용자체는 어렵지 않았다.

ㅁ느낀 점
- 물론 엄청 간단하게만 구현해본 거라서 엄청난 것을 이룬 것은 아니지만
해본 것과 모르는 것은 차원이 다르다고 생각합니다.
예를 들어 Broadcast Receiver 는 더 공부가 필요하겠지만 특정 Action을 감지해야 한다는 목표가 생겼을 때,
어렵게 생각할 것 없이 onReceive 메서드가 먼저 떠오르겠죠.

지금까지와는 다르게 너무 어렵게 생각하지 않고 interface 만 이해하면서 구현해봤습니다.
언젠가는 꼭 이렇게 묶여있는 프로젝트로 구현해보고 싶었는데 속이 다 시원합니다.
