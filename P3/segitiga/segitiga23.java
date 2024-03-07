package P3.segitiga;

public class segitiga23 {
    public double alas;
    public double tinggi;
    public double miring = Math.pow(alas, 2)+Math.pow(tinggi,2);
    
    

    public double hitungluas(double a ,double t) {
        alas=a;
        tinggi=t;
        double luas = 0.5 * a * t;
        return luas;
    }

    public double hitungKeliling(double a,double t,double m) {
        alas = a;
        tinggi = t;
        miring = m;

        double keliling = a + t + m;
        return keliling;

     }
}
