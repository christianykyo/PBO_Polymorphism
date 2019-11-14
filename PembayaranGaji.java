
package pbo_polymorphism;

public class PembayaranGaji {
    public int hitunganGaji(Pegawai peg) {
        int uang = peg.gaji();
        if (peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        if(peg instanceof Staff)
            uang += ((Staff)peg).Bonus();
        return uang;
    }
    
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staff ali = new Staff();
        Direktur tony = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staff: " + pg.hitunganGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur: " + pg.hitunganGaji(tony));
    }
}
