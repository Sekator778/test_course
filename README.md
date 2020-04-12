# Курс тест по Java

Цель курса
----------

Проверить логические и алгоритмические способности ученика заниматься профессиональным программированием. 
Кандидаты полностью выполнившие все задания могут смело продолжать изучать программирование, 
т.к. у них есть хороший потенциал стать высококвалифицированными разработчиками ПО.
Кандидатам, которые испытывают сложности в выполнении данных задач, следует обратить внимание 
на смежные области разработки ПО, такие как: QA Automation, аналитик, функциональный программист, support.

Описание
--------

В курсе собраны 20 задач возрастающей сложности. Каждая задача состоит из подготовленного каркаса классов и 
полностью написанных автоматических тестов. То есть все задания будут автоматически проверены.
В данном курсе используется подход TDD. Инструменты необходимые для прохождения курса: Maven, Git, Java 8.

Для получения исходного кода нужно выполнит команду 

*git clone git@github.com:peterarsentev/course_test.git*

Проект собрать через maven. Задания курса находятся в отдельных пакетах 

*/src/main/java/ru/parsentev/task_XXX/package-info.java*

а так же продублированы ниже.

Ученик должен ознакомиться c заданием и перейти к реализации недостающего кода и классов. 
После завершения реализации ученик должен зайти в папку 

*/src/test/java/ru/parsentev/task_XXX/*

и в каждом классе убрать аннотацию 

*@Ignore* - это аннотация используется для игнорирования тестов.

после этого ученик должен перейти в корень проекта и выполнить команду

*mvn clean test*

Система сборки должна успешно пройти все тесты. Если тесты упали, необходимо поправить ваш код.
Код тестов править нельзя. 

В репозитории есть две ветки

- master - каркас заданий с тестами.
- solution - полностью выполненные задания с тестами.

Смотреть решения рекомендуется после успешной реализации кода и успешно пройденных тестов.

В качестве теоретического материала для подготовки к курсу следует прочитать следующие книги:

*Head First Java, 2nd Edition: Kathy Sierra, Bert Bates*

*Алгоритмы. Руководство по разработке, Стивен С. Скиена*

Темы необходимые для прохождения курса.

- Типы данных
- Арифметические операции
- Операторы условия
- Циклы
- Массивы
- Наследование
- Полиморфизм
- Инкапсуляция
- Исключения

Задания
-------

1. Реализовать программу калькулятор. Калькулятор должен выполнять операции:
   сложение, вычитание, умножение, деление, возведение в степень.
   При выполнении деления ввести проверку на 0.
   Если второй аргумент 0 нужно выкинуть исключение java.lang.IllegalStateException
   
2. Реализовать класс точку, описывающую точку в системе координат x, y - Point(x, y).
   объект точка должен иметь методы double Point#distanceTo(Point point) - метод должен вычислять расстояние
   между двумя точками.

3. Реализовать класс треугольник. Треугольник должен описываться через точки в системе координат.
   Объект треугольник должен иметь методы:
   boolean exists() - проверяет существует ли треугольник или нет.
   double area() - вычисляет площадь треугольника. 
   Если треугольник не существует выбросить исключение java.lang.IllegalStateException
   
4. Реализовать класс равнобедренный треугольник наследуя класс треугольник из задания 3.
   Дополнить поведение метода boolean exists() - true, если треугольник равнобедренный.
   Остальное поведение оставить прежним.

5. Реализовать класс прямоугольный треугольник наследуя класс треугольник из задания 3.
   Дополнить поведение метода boolean exists() - true, если треугольник равносторонний. 
   Остальное поведение оставить прежним.

6. Реализовать класс квадрат основанный на четырех точках Point(x, y).
   boolean exists() - проверяет существует ли квадрат или нет.

7. Реализовать класс Expression. Класс должен принимать строку из просто математического выражения
   и методы double calc(). Должен поддерживать операции + - / * exp.
   Например, "2+2" - 4, "2-2" - 0
   Если выражение не корректное выбросить исключение java.lang.IllegalStateException

8. Реализовать класс вычисляющий простые числа до N.

9. Реализовать метод подсчета уникальных символов в строке.

10. Реализовать методы проверки корректности открытых и закрытых скобок.
    Например, ()(()((()))) - true, ()) - false
 
11. Задан массив чисел со значениями 0 и 1. Нужно проверить, что все значения в массиве равны 1.
    Например, [0, 1] - false, [1, 1] - true, 

12. Задан массив чисел со значениями 0 и 1. 
    Нужно проверить, что в массиве есть последовательности из трех и больше единиц.
    Например, [0, 1, 1] - false, [1, 1, 1] - true,

13. Задан числовой массив. Нужно проверить, что все значения в массиве одинаковые.
    Например, [0, 0, 0] - true, [1, 1, 1] - true, [0, 1, 1] - false,

14. Задано предложение. Нужно переставить слова в обратно порядке.
    Например, "программируй и зарабатывай" -> "зарабатывай и программируй"

15. Задан числовой массив. Нужно реализовать метод кольцевого сдвига на N. int[] shift(). 
    Не использовать дополнительный массив.
    Например, [1, 2, 3, 4, 5] - shift(2) - [4, 5, 1, 2, 3]

16. Задан квадратный массив. Нужно проверить, что в нем есть выигрышные варианты для игры крестики-нолики.

17. Реализован банкомат размена денег. Автомат принимает бумажную купюру и обменивает на монеты. 
    Метод должен возвращать список всех возможных вариантов размены купюры.

18. Задан двойной массив, заполненный нулями и единицами. Нужно определить самое большое множество единиц. 
    Множеством считается объединение единиц, которые соприкасаются друг с другом. 
    Диагональное соприкосновение не учитывать.

19. Задан двойной массив из единиц и нулей. Нужно найти минимальный путь от точки А до точки В. 
    Двигаться можно только по единицам и только в вниз или вправо. 

20. Задан одномерный массив. Нужно найти все возможные варианты перестановок этого массива.

21. Задач список скриптов с указанием их зависимосей. 
    
    1 - [2, 3],
    2 - [4],
    3 - [4, 5],
    4 - [],
    5 - []
    
    Необходим написать метод, который возвращает список всех скриптов, 
    которые нужно для загрузки входящего скрипта.
    
    Например, чтобы выполнить скрипт 1. нужно выполнить скрипт (2, 3),
    которые в свою очередь зависят от 4 и 5 скрипта.
    
    List<Integer> load(Map<Integer, List<Integer> ds, Integer scriptId)
    
22. Задан двухмерных массив. Массив заполнен числами. По массиву двигается робот.
    Робот может двигаться вниз, вверх и вправо.
    Задача начальная точка и конечная. Перемещение из одной ктелки в другую затрачивает энергацию.
    Рассчитывается она разность модуля значений клетов. 
    Например, ход из клетки 1 в 10 будет оцениваться в 9 единиц.
    Необходимо написать метод, который определяет наименее трудозатратный путь.
    
    int optimalWay(int[][] board, int sx, int sy, int fx, int fy)
    
        [1, 2, 3]
        [1, 3, 6]
        [1, 1, 5] 
    
    start (0, 0), finish (3, 3). Ответ: 4. Путь 1 1 1 1 5
    
23. Задач двухмерный массив. Массив заполнен нулями и единицами. Робот может ходить только по единицам.
    Задача начальная и конечная точка. Робот может ходить вверх, вних, влево и вправо.
    Необходимо найти минимальный путь до конечной точки.
    
    int minWay(int[][] board, int sx, int sy, int fx, int fy)# test_course
