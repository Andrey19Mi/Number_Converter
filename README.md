# Number_Converter  
  

## Описание
Конвертер чисел из числового предствавления в словесное и обратно.  
Конвертирует числа на русском и английском до 12 разрядов.  
  
Перед запуском проекта надо именить параметры для подключения к пустой базе данных в src\main\resources\application.properties  

## Запуск проетка  
1. Зайти в дирикторию проекта  
2. Запустить проект, необходим maven
```mvn spring-boot:run```
3. Остановить проект `Ctrl + C`

## Пример использования  
Авторизация через Basic Auth или через дефолтную форму spring security  
Авторизироваться можно по:  
+ username: `user`
+ password: `user`
 
### Примеры запроса
Без указания языка по дефолту русский:

    - localhost:8080/convert?type=NumberToString&value=120 000
    - localhost:8080/convert?type=StringToNumber&value=сто двадцать тысяч
С указанием языка:

    - localhost:8080/convert?type=NumberToString&value=120 000&lang=eng
    - localhost:8080/convert?type=StringToNumber&value=сто двадцать тысяч&lang=rus
