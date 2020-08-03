# jv-cloneable

Дано класс Car и класс Engine. Определите метод клон так чтобы клонирование было глубоким.
Добавьте минимум 5 полей в каждый класс (Car and Engine). Не забудьте использовать двигатель в автомобиле.
Также нужно переопределить метод toString() для машины и мотора.

Проверьте работу метода `clone ()` в классе `Application`.
Для этого:
1. создайте мотор;
2. создайте машину и присвойте ей мотор;
3. вызовите метод clone () на только что созданной машине, результат присвойте новой переменной;
4. измените один из параметров (полей) мотора, который был создан в начале (п.1);
5. выведите в консоль параметры обеих машин. Сравните, моторы для обеих машин. Если параметры мотора отличаются - задание выполнено правильно.
