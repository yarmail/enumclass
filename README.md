<h3> Класс Enum</h3>

<b>Описание</b><br>
Изучаем на примерах класс Enum<br>

Жми ★ если понравилось.<br><br>

Enum в Java используется, когда нужно работать с небольшимим <br>
количеством объектов, например, дни недели, времена года, месяцы <br>
До появления Enum использовались int. Проблемы: int не всегда удобно, <br>
если animal = 100, то непонятно какое это животное, появляется <br>
неопредленность, также нужна расшифровка значений <br>
Пример:
<a href="/src/main/java/org/example/ABeforeEnum.java">ABeforeEnum.java</a> <br><br>

В перечислении мы перечисляем все объекты, которые нам нужны <br>
Далее мы можем создавать объекты этих классов (энамов)<br>
(пробуем повторить ситуацию класса ABeforeEnum) <br>
Удобно тем, что в переменную мы можем поместить только заявленные <br> 
перечисления. Сразу понятно, какое именно перечисление мы помещаем<br>
Пример:
<a href="/src/main/java/org/example/BEnum.java">BEnum.java</a> <br><br>

Наследование<br>
Все классы наследуют Object Object -> Class<br>
Перечисления наследуются так: Object -> Enum -> OurEnum<br>
Покажем это в примере. Вывод: везде будет true <br>
Также мы можем показать, что перечисления являются объектами<br> 
"класса" в котором они находятся <br>
Пример:
<a href="/src/main/java/org/example/CInheritance.java">CInheritance.java</a> <br><br>

Конструктор, геттер, сеттер, toString <br>
Конструктор по умолчанию будет приватным <br>
Так же как и при создании  объектов мы можем использовать разные <br> 
конструкторы при создании перечислений <br>
Также можно использовать геттеры и сеттеры <br>
Также можно вывести название класса (два способа) <br> 
Также можно переопределять toString <br>
Пример:
<a href="/src/main/java/org/example/EConstructor.java">EConstructor.java</a> <br><br>

Другие полезные свойства и методы <br>
.valueOf - перевод пользовательского ввода в объект перечисления <br>
.ordinal - индекс перечисления (у SOME = 3) <br>
.values - возможность перебирать перечисления <br>
Пример:
<a href="/src/main/java/org/example/FMethods.java">FMethods.java</a> <br><br>