 ``` 
Задание 1. *Представьте, что вы работаете над разработкой простого приложения
для записной книжки, которое позволяет пользователям добавлять, редактировать и 
удалять контакты.
Ваша задача - придумать как можно больше различных тестов 
(юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. 
Напишите название каждого теста, его тип и краткое описание того, 
что этот тест проверяет.
```

1. Юнит-тесты:
- Тест на добавление контакта: проверяет, что контакт успешно добавляется в адресную книгу.
- Тест на редактирование контакта: проверяет, что контакт успешно редактируется в адресной книге.
- Тест на удаление контакта: проверяет, что контакт успешно удаляется из адресной книги.
- Тест на получение всех контактов: проверяет, что метод getAllContacts возвращает все контакты из адресной книги.

2. Интеграционные тесты:
- Тест на добавление контакта через пользовательский интерфейс и проверка, что контакт отображается в списке контактов.
- Тест на редактирование контакта через пользовательский интерфейс и проверка, что контакт успешно обновляется в адресной книге.
- Тест на удаление контакта через пользовательский интерфейс и проверка, что контакт успешно удаляется из адресной книги.

3. Сквозные тесты:
- Тест на полный цикл работы с контактом: создание контакта, его редактирование и последующее удаление. Проверка, что контакт корректно обновляется и удаляется из адресной книги.

```
Задание 2. Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста
(юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.
- Проверка того, что функция addContact корректно добавляет новый контакт в список 
контактов"".
- Проверка того, что при добавлении контакта через пользовательский интерфейс, 
контакт корректно отображается в списке контактов"".
- Проверка полного цикла работы с контактом: создание контакта, его редактирование и 
последующее удаление"".
```

1. Тест на добавление контакта (юнит-тест): Это юнит-тест, так как он проверяет функциональность отдельного метода (addContact) без зависимости от других компонентов.
2. Тест на отображение контакта в пользовательском интерфейсе (интеграционный тест): Это интеграционный тест, так как он проверяет взаимодействие между компонентами приложения (пользовательский интерфейс и список контактов).
3. Тест на полный цикл работы с контактом (сквозной тест): Это сквозной тест, так как он проверяет полный цикл работы с контактом, включая создание, редактирование и удаление, и взаимодействие между различными компонентами приложения.