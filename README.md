## 15. 📖 Библиотека Owner.

### 🖊 Задание
#### Конфигурация API тестов

Сделать пример конфигурации для API тестов:

1. Базовый url

2. Токен

Токен нужно передавать защищенно:

1. Через файл на файловой системе

2. Через системные property

#### Конфигурация WEB тестов

Сделать пример конфигурации для WEB тестов:

1. Имя браузера

2. Версия браузера

3. Локальный или удаленный (RemoteWebDriver)

Сделать два вида конфигурационных файлов:

1. Для локального запуска на chrome

2. Для удаленного запуска на selenoid

#### 🚀 Запуск тестов из терминала
* Локально ``gradle clean test -DtypeProperties=locale``
* Удалённо ``gradle clean test -DtypeProperties=remote``

#### <img src="https://user-images.githubusercontent.com/93325839/149427022-38672787-1ab0-4752-98bd-846af8eb5462.png" width="50" height="50"/> Запуск Job в Jenkins
1. Открыть сборку [Jenkins](https://jenkins.autotests.cloud/job/009_qaguru_j_unicorn_hw15_owner/).  
2. Нажать *"Собрать с параметрами"*.
3. Нажать на кнопку *"Собрать"*.

#### Видео прохождения тестов в Selenoid 

https://user-images.githubusercontent.com/93325839/149427762-c9997bb1-45a4-4fa3-bf27-ff359d768ace.mp4  

#### Уведомление о прохождении тестов в Telegram 

![image](https://user-images.githubusercontent.com/93325839/149427952-b8f58714-b14d-42a1-b373-548d8f94df48.png)  

