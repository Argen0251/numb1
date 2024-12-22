package Education;

public class errornfo {
    public static void main(String[] args) {
        erinfo err = new erinfo();
        errr e;
        e=err.getinfo(2);
        System.out.println(e.msg+" - level: "+ e.level);
        e=err.getinfo(19);
        System.out.println(e.msg+" - level: "+ e.level);
    }
}
