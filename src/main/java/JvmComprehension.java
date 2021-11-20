public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;                      // 1 В стэке в фрейм метода main добавляется примитив и его значение
        Object o = new Object();        /* 2 В метаспейс загружается класс Object (если он не был загружен до этого)
                                             В кучу добавляется объект Object, ссылка на него добаваляется в стэк, в фрейм метода main */
        Integer ii = 2;                 /* 3 В метаспейс загружается класс Integer (если он не был загружен до этого)
                                             В кучу добавляется объект Integer, ссылка на него добаваляется в стэк, в фрейм метода main */
        printAll(o, i, ii);             /* 4 В стэке для метода printAll появляется новый фрейм;
                                             В куче создаются два новых объекта: Integer, Object;
                                             В стэке, в фрейм метода printAll, копируются две ссылки и добавляется один примитив со значением 0 */
        System.out.println("finished"); /* 7 В метаспейс загружается класс PrintStream (если он не был загружен до этого);
                                             В кучу добавляется объект String со значением "finished";
                                             В стеке создается фрейм метода println и в него копируется ссылка на объект String. */
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 В кучу добавляется объект Integer со значением 700, ссылка на него добавляется в стэк, в фрейм метода printAll
        System.out.println(o.toString() + i + ii);  /* 6 В метаспейс загружается класс System (если он не был загружен до этого);
                                                         В куче создается объект String;
                                                         В стеке создается фрейм метода println и в него копируется ссылка на объект String;
                                                         В стеке создается фрейм метода toString. */

    }
}
