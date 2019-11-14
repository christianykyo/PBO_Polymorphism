package pbo_polymorphism;

public class Staff extends Pegawai {
    private static final int gajiStaff = 50000;
    private static final int bonusStaff = 10000;
    
    public int gaji() {
        return gajiStaff;
    }
    public int Bonus() {
        return bonusStaff;
    }
}
