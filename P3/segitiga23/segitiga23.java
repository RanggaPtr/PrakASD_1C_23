package P3.segitiga23;

public class segitiga23 {
    public double alas;
    public double tinggi;
    public double miring ;

    public segitiga23 (double a,double t){
        alas = a;
        tinggi = t;
    }
    
    public double hitungluas() {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }
    
    public double hitungKeliling() {
        miring =Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + miring;
        return keliling;

    }
}
