package JavaBreakthrough.Final;

public class Test {

    // Final переменные пишутся большими буквами.
    // Также может быть static, нет смысла каждому объекту давать свою константу и выделять лишнюю память
    // Если она static, то ее надо инициализировать
    //public final int CONSTANT;
    public static final int CONSTANT = 0;

    // public Test(int CONSTANT) { инициализировать ее как конструктор надо лишь если она final, но если она static, то конструктор не нужен, мы ее сами проинициализировали
    //   this.CONSTANT = CONSTANT;
    //}

    //public void setCONSTANT(int x) { мы не можем менять константу
    //   this.CONSTANT = x;
    //}
}
