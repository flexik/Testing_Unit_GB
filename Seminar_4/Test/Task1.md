### Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?


## <span style="color:red"> Ответы:</span>
1. `Использование тестовых заглушек может быть полезным при написании модульных тестов, так как они позволяют изолировать тестируемый код от зависимостей, таких как внешние сервисы или базы данных. Заглушки позволяют заменить реальные зависимости на контролируемые объекты, которые можно настроить для возвращения ожидаемых результатов или проверки вызовов методов.`
2. `Для проверки вызова метода с определенными аргументами следует использовать mock-объекты. Mockito предоставляет возможность создавать мок-объекты, которые можно настроить для ожидания вызова определенного метода с определенными аргументами.`
3. `Для возвращения определенного значения или исключения в ответ на вызов метода следует использовать stub-объекты.`
4. `Для имитации взаимодействия с внешним API или базой данных следует использовать mock-объекты.`
