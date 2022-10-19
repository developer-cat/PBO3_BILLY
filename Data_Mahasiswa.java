import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Data_Mahasiswa extends PBO3_Mahasiswa {
    Data_Mahasiswa(String nim, String nama, int nilai){
        super(nim, nama, nilai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PBO3_Mahasiswa> mhs = new ArrayList<>();
        ArrayList<String> lulus = new ArrayList<>();
        ArrayList<String> tidak_lulus = new ArrayList<>();
        ArrayList<String> nilaiA = new ArrayList<>();
        ArrayList<String> nilaiB = new ArrayList<>();
        ArrayList<String> nilaiC = new ArrayList<>();
        ArrayList<String> nilaiD = new ArrayList<>();
        ArrayList<String> nilaiE = new ArrayList<>();
 
        int jumlah_lulus = 0;
        int jumlah_tidaklulus = 0;
        int jumlah_nilaiA = 0;
        int jumlah_nilaiB = 0;
        int jumlah_nilaiC = 0;
        int jumlah_nilaiD = 0;
        int jumlah_nilaiE = 0;
        double jumlah_semuaNilai = 0;
        double ratarata;

        for(int i = 0;i <= 3; i++){            
            System.out.print("Isikan Nim   : ");
            String nim = sc.nextLine();

            System.out.print("Isikan Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Isikan Nilai : ");
            int nilai = Integer.parseInt(sc.nextLine());

            mhs.add(new Data_Mahasiswa(nim,nama,nilai));
            System.out.println("--------------------------------------------");
        }
        
        if(mhs.get(0).getNilai() >= 0 && mhs.get(0).getNilai()<=100 &&
           mhs.get(1).getNilai() >= 0 && mhs.get(1).getNilai()<=100 &&
           mhs.get(2).getNilai() >= 0 && mhs.get(2).getNilai()<=100 &&
           mhs.get(3).getNilai() >= 0 && mhs.get(3).getNilai()<=100){ 
            System.out.println("");
            
            for(int i = 0;i <= 3; i++){
                mhs.get(i).output_mahasiswa();
                System.out.println("=====================================================");
            }
    
            System.out.println("Jumlah Mahasiswa : " + mhs.size());
            System.out.print("Jumlah Mahasiswa yang Lulus : ");
            for(int i = 0; i <= 3; i++){
                if(mhs.get(i).getGrade() == "A" || mhs.get(i).getGrade() == "B" || mhs.get(i).getGrade() == "C"){
                    jumlah_lulus++;
                    lulus.add(mhs.get(i).getNama());
                }
                else{
                    jumlah_tidaklulus++;
                    tidak_lulus.add(mhs.get(i).getNama());
                }
            }
            if(jumlah_lulus > 0){
                System.out.print(jumlah_lulus + " yaitu " + Arrays.toString(lulus.toArray()));
            }
            
            else{
                System.out.print("0");
            }
    
            System.out.println("");
            System.out.print("Jumlah Mahasiswa yang Tidak Lulus : ");
            if(jumlah_tidaklulus > 0){
                System.out.print(jumlah_tidaklulus + " yaitu " + Arrays.toString(tidak_lulus.toArray()));
            }
            
            else{
                System.out.print("0");
            }
    
            System.out.println("");
            for(int i = 0; i <= 3; i++){
                if(mhs.get(i).getGrade() == "A"){
                    jumlah_nilaiA++;
                    nilaiA.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade() == "B"){
                    jumlah_nilaiB++;
                    nilaiB.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade() == "C"){
                    jumlah_nilaiC++;
                    nilaiC.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade() == "D"){
                    jumlah_nilaiD++;
                    nilaiD.add(mhs.get(i).getNama());
                }
                if(mhs.get(i).getGrade() == "E"){
                    jumlah_nilaiE++;
                    nilaiE.add(mhs.get(i).getNama());
                }
            }
            
            if(jumlah_nilaiA > 0){
                System.out.println("Jumlah Mahasiswa dengan Nilai A = " + jumlah_nilaiA + " yaitu " + nilaiA);
            }
            if(jumlah_nilaiB > 0){
                System.out.println("Jumlah Mahasiswa dengan Nilai B = " + jumlah_nilaiB + " yaitu " + nilaiB);
            }
            if(jumlah_nilaiC > 0){
                System.out.println("Jumlah Mahasiswa dengan Nilai C = " + jumlah_nilaiC + " yaitu " + nilaiC);
            }
            if(jumlah_nilaiD > 0){
                System.out.println("Jumlah Mahasiswa dengan Nilai D = " + jumlah_nilaiD + " yaitu " + nilaiD);
            }
            if(jumlah_nilaiE > 0){
                System.out.println("Jumlah Mahasiswa dengan Nilai E = " + jumlah_nilaiE + " yaitu " + nilaiE);
            }
    
            System.out.print("Rata-rata nilai mahasiswa adalah : ");
            jumlah_semuaNilai = mhs.get(0).getNilai() + mhs.get(1).getNilai() + mhs.get(2).getNilai() + mhs.get(3).getNilai();
            ratarata = jumlah_semuaNilai/mhs.size();
            System.out.print(mhs.get(0).getNilai() + "+" + mhs.get(1).getNilai()+"+" + mhs.get(2).getNilai() + "+" + mhs.get(3).getNilai() + " / "+mhs.size() + " = " + ratarata);    
        }
        else{
            System.out.println("Input nilai anda salah");
        }
   }
}