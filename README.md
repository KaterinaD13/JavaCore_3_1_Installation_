# Задача 1: Установка
## Описание
В данной задаче Вы потренируетесь работать с файлами и каталогами в файловой системе, используя язык Java и класс File, и смоделируете процесс установки игры на жесткий диск комьютера.  

Предварительно вручную создайте папку Games в удобном для Вас месте. Имейте ввиду, что у папки Games должны быть права на запись и чтение. Например, в операционной системе macOS можно создать папку по следующему пути /Users/admin/Games. В ОС Windows можете создать папку на одном из доступных жестких дисков, например D://Games.  

Установку программы необходимо производить из Java кода с использованием класса File. Процесс будет состоять из следующих этапов:  

1. В папке Games создайте несколько директорий: src, res, savegames, temp.  
2. В каталоге src создайте две директории: main, test.  
3. В подкаталоге main создайте два файла: Main.java, Utils.java.  
4. В каталог res создайте три директории: drawables, vectors, icons.  
5. В директории temp создайте файл temp.txt.  
Файл temp.txt будет использован для записиси в него информации об успешноном или неуспешном создании файлов и директорий.  

## Реализация
Для работы с файлом или директорией необходимо создать для них свой экземпляр класса File, передав в конструктор адрес к файлу или директории. Создать директорию можно с помощью метода mkdir(), который возвращает true или false в зависимости от того, была ли директория создана успешно.  

Для создания файла можно использовать метод createNewFile(), который так же возвращает boolean. Обратите внимание, что этот метод пробрасывает IOException. Необходимо обернуть его в блок try-catch.

Для сохранения лога используйте экземпляр класса StringBuilder. Добавляйте в него всю информацию о создании файлов и каталогов. Далее возьмите из него текст и запишите его в файл temp.txt с помощью класса FileWriter.

В результате выполнения программы, на жестком диске комьютера в папке Games должны появиться вышеуказанные файлы и директории. Файл temp.txt должен содержать информацию о том, что все файлы были созданы успешно.