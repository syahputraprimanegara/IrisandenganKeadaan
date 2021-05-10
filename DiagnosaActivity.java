package com.example.profilproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiagnosaActivity extends Activity {
    CheckBox G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,G12,G13,G14,G15,G16,G17,G18,G19,G20;
    Button BtnDiagnosa;
    Button ResetDiagnosa;
    public int numberikangka[]= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    ArrayList<Integer> arraypenampung= new ArrayList<Integer>();

    public TextView txtHasilDiagnosa;
    SpaceNavigationView spaceNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        G1 = findViewById(R.id.G1);
        G2 = findViewById(R.id.G2);
        G3 = findViewById(R.id.G3);
        G4 = findViewById(R.id.G4);
        G5 = findViewById(R.id.G5);
        G6 = findViewById(R.id.G6);
        G7 = findViewById(R.id.G7);
        G8 = findViewById(R.id.G8);
        G9 = findViewById(R.id.G9);
        G10 = findViewById(R.id.G10);
        G11 = findViewById(R.id.G11);
        G12 = findViewById(R.id.G12);
        G13 = findViewById(R.id.G13);
        G14 = findViewById(R.id.G14);
        G15 = findViewById(R.id.G15);
        G16 = findViewById(R.id.G16);
        G17 = findViewById(R.id.G17);
        G18 = findViewById(R.id.G18);
        G19 = findViewById(R.id.G19);
        G20 = findViewById(R.id.G20);

        BtnDiagnosa = findViewById(R.id.BtnDiagnosa);
        txtHasilDiagnosa = findViewById(R.id.TextHasil);
        ResetDiagnosa = findViewById(R.id.BtnResetDiagnosa);
        spaceNavigationView = findViewById(R.id.spacediagnosa);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_history_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_add_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_favorite_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_settings_black_24dp));

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                Toast.makeText(DiagnosaActivity.this, "Home Page", Toast.LENGTH_SHORT).show();
                spaceNavigationView.setCentreButtonSelectable(true);

                Intent Dashboard = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Dashboard);
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                Toast.makeText(DiagnosaActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
                Toast.makeText(DiagnosaActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
            }
        });

        ResetDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHasilDiagnosa.setText("0");
            }
        });
    }


   //inisialisasi Checkbox ketika di checklist
   //Memberikan nilai misal G1 Dichecklist memberi nilai 1 , dan 2 untuk checkbox 2
   public void onCheckbox(View view){
       boolean checked= ((CheckBox)view).isChecked();
       switch (view.getId()){
           case  R.id.G1:
               if (checked){
                   arraypenampung.add(numberikangka[1]);
               }
               else{
                   arraypenampung.remove(new Integer(1));
               }break;

           case  R.id.G2:
               if (checked){
                    arraypenampung.add(numberikangka[2]);
               }
               else{
                   arraypenampung.remove(new Integer(2));
               }break;

           case  R.id.G3:
               if (checked){
                   arraypenampung.add(numberikangka[3]);
               }
               else{
                   arraypenampung.remove(new Integer(3));
               }break;

           case  R.id.G4:
               if (checked){
                   arraypenampung.add(numberikangka[4]);
               }
               else{
                   arraypenampung.remove(new Integer(4));
               }break;

           case  R.id.G5:
               if (checked){
                   arraypenampung.add(numberikangka[5]);
               }
               else{
                   arraypenampung.remove(new Integer(5));
               }break;
           case  R.id.G6:
               if (checked){
                   arraypenampung.add(numberikangka[6]);
               }
               else{
                   arraypenampung.remove(new Integer(6));
               }break;
           case  R.id.G7:
               if (checked){
                   arraypenampung.add(numberikangka[7]);
               }
               else{
                   arraypenampung.remove(new Integer(7));
               }break;

           case  R.id.G8:
               if (checked){
                   arraypenampung.add(numberikangka[8]);
               }
               else{
                   arraypenampung.remove(new Integer(8));
               }break;

           case  R.id.G9:
               if (checked){
                   arraypenampung.add(numberikangka[9]);
               }
               else{
                   arraypenampung.remove(new Integer(9));
               }break;

           case  R.id.G10:
               if (checked){
                   arraypenampung.add(numberikangka[10]);
               }
               else{
                   arraypenampung.remove(new Integer(10));
               }break;
           case  R.id.G11:
               if (checked){
                   arraypenampung.add(numberikangka[11]);
               }
               else{
                   arraypenampung.remove(new Integer(11));
               }break;

           case  R.id.G12:
               if (checked){
                   arraypenampung.add(numberikangka[12]);
               }
               else{
                   arraypenampung.remove(new Integer(12));
               }break;

           case  R.id.G13:
               if (checked){
                   arraypenampung.add(numberikangka[13]);
               }
               else{
                   arraypenampung.remove(new Integer(13));
               }break;

           case  R.id.G14:
               if (checked){
                   arraypenampung.add(numberikangka[14]);
               }
               else{
                   arraypenampung.remove(new Integer(14));
               }break;

           case  R.id.G15:
               if (checked){
                   arraypenampung.add(numberikangka[15]);
               }
               else{
                   arraypenampung.remove(new Integer(15));
               }break;
           case  R.id.G16:
               if (checked){
                   arraypenampung.add(numberikangka[16]);
               }
               else{
                   arraypenampung.remove(new Integer(16));
               }break;
           case  R.id.G17:
               if (checked){
                   arraypenampung.add(numberikangka[17]);
               }
               else{
                   arraypenampung.remove(new Integer(17));
               }break;
           case  R.id.G18:
               if (checked){
                   arraypenampung.add(numberikangka[18]);
               }
               else{
                   arraypenampung.remove(new Integer(18));
               }break;
           case  R.id.G19:
               if (checked){
                   arraypenampung.add(numberikangka[19]);
               }
               else{
                   arraypenampung.remove(new Integer(19));
               }break;
           case  R.id.G20:
               if (checked){
                   arraypenampung.add(numberikangka[20]);
               }
               else{
                   arraypenampung.remove(new Integer(20));
               }break;
       }
   }


    public void newgaabungan2(int c, int d){
        int urut1 = 0;
        int urut2= 0;

        List<Integer> Urutan=new ArrayList<>();
        Urutan.add(c);
        Urutan.add(d);

        Collections.sort(Urutan); //Mengurutkan Index2 Pada List Urutan.

        urut1=Urutan.get(0);
        urut2=Urutan.get(1);

        //Perhitungan
        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70, 0.70,0.35,0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[0],Bobot[urut1], Bobot[urut2]}; //012
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;


        //Irisan Himpunan
        Set<String> Gejala0=new HashSet<String >();
        Gejala0.add("KOSONG");
        Set<String> Gejala1 = new HashSet<String>();
        Gejala1.add("Feline Infectous Peritonitis"); //p1
        Gejala1.add("Konstipasi"); //p10
        Set<String> Gejala2 = new HashSet<String>();
        Gejala2.add("Feline Infectous Peritonitis"); //p1
        Gejala2.add("Rhinotracheitis"); //p2
        Gejala2.add("Calcivirus"); //p3
        Gejala2.add("Feline Panleukopia"); //p4
        Gejala2.add("Chlamydia"); //p7
        Gejala2.add("Rabies");//P11
        Gejala2.add("Pyometra");//P14
        Gejala2.add("Leukimia"); //P15
        Set<String> Gejala3 = new HashSet<String>();
        Gejala3.add("Feline Infectous Peritonitis"); //p1
        Gejala3.add("Feline Panleukopia"); //p4
        Gejala3.add("Flutd"); //p9
        Gejala3.add("Hepatitis"); //p12
        Gejala3.add("Gagal ginjal"); //p13
        Gejala3.add("Pyometra"); //p14
        Set<String> Gejala4 = new HashSet<String>();
        Gejala4.add("Rhinotracheitis"); //p2
        Set<String> Gejala5 = new HashSet<String>();
        Gejala5.add("Rhinotracheitis"); //p2
        Gejala5.add("Calcivirus"); //p3
        Gejala5.add("Flutd"); //p9
        Gejala5.add("Konstipasi");//p10
        Gejala5.add("Rabies"); //p11
        Gejala5.add("Hepatitis"); //p12
        Gejala5.add("Gagal Ginjal");//p13
        Gejala5.add("Feline Leukimia");//p15
        Set<String> Gejala6 = new HashSet<String>();
        Gejala6.add("Calcivirus");
        Set<String> Gejala7 = new HashSet<String>();
        Gejala7.add("Feline Panleukopia");
        Gejala7.add("Cacingan");
        Set<String> Gejala8 = new HashSet<String>();
        Gejala8.add("Jamur");
        Gejala8.add("Scabies");
        Set<String> Gejala9 = new HashSet<String>();
        Gejala9.add("Jamur"); //p5
        Gejala9.add("Cacingan"); //p6
        Gejala9.add("Scabies"); //p8
        Set<String> Gejala10 = new HashSet<String>();
        Gejala10.add("Jamur");
        Set<String> Gejala11 = new HashSet<String>();
        Gejala11.add("Cacingan"); //p6
        Set<String> Gejala12 = new HashSet<String>();
        Gejala12.add("Chlamydia");
        Set<String> Gejala13 = new HashSet<String>();
        Gejala13.add("Scabies");
        Set<String> Gejala14 = new HashSet<String>();
        Gejala14.add("Konstipasi"); //p10
        Set<String> Gejala15 = new HashSet<String>();
        Gejala15.add("Rabies"); //p11
        Set<String> Gejala16 = new HashSet<String>();
        Gejala16.add("Flutd"); //p9
        Set<String> Gejala17 = new HashSet<String>();
        Gejala17.add("Hepatitis");
        Set<String> Gejala18 = new HashSet<String>();
        Gejala18.add("Gagal Ginjal");
        Set<String> Gejala19 = new HashSet<String>();
        Gejala19.add("Pyometra");
        Set<String> Gejala20 = new HashSet<String>();
        Gejala20.add("Feline Leukimia");

        List<Set<String>> ListGejalaUntukIndexParameterClass = new ArrayList<>(); //penampung yang akan diindeksasikan
        ListGejalaUntukIndexParameterClass.add(Gejala0);
        ListGejalaUntukIndexParameterClass.add(Gejala1); //Cara memanggil ListGejalaUntukIndexParameter.get(1)
        ListGejalaUntukIndexParameterClass.add(Gejala2);
        ListGejalaUntukIndexParameterClass.add(Gejala3);
        ListGejalaUntukIndexParameterClass.add(Gejala4);
        ListGejalaUntukIndexParameterClass.add(Gejala5);
        ListGejalaUntukIndexParameterClass.add(Gejala6);
        ListGejalaUntukIndexParameterClass.add(Gejala7);
        ListGejalaUntukIndexParameterClass.add(Gejala8);
        ListGejalaUntukIndexParameterClass.add(Gejala9);
        ListGejalaUntukIndexParameterClass.add(Gejala10);
        ListGejalaUntukIndexParameterClass.add(Gejala11);
        ListGejalaUntukIndexParameterClass.add(Gejala12);
        ListGejalaUntukIndexParameterClass.add(Gejala13);
        ListGejalaUntukIndexParameterClass.add(Gejala14);
        ListGejalaUntukIndexParameterClass.add(Gejala15);
        ListGejalaUntukIndexParameterClass.add(Gejala16);
        ListGejalaUntukIndexParameterClass.add(Gejala17);
        ListGejalaUntukIndexParameterClass.add(Gejala18);
        ListGejalaUntukIndexParameterClass.add(Gejala19);
        ListGejalaUntukIndexParameterClass.add(Gejala20);

        Set<String>IndexKosong=ListGejalaUntukIndexParameterClass.get(0);
        Set<String> indexpertamaParameter =ListGejalaUntukIndexParameterClass.get(urut1) ; //fungsi pemanggilan Posisi ListGejala Berdasarkan Parameter
        Set<String> indexkeduaParameter = ListGejalaUntukIndexParameterClass.get(urut2);

        List<Set<String>> ListPenampung = new ArrayList<>(); //list tidak Mampu membaca GET.(0)
        ListPenampung.add(indexpertamaParameter); //sebagai nol
        ListPenampung.add(indexpertamaParameter);
        ListPenampung.add(indexkeduaParameter);

       /* List<Set<String>> CobaList= new ArrayList<>();
        CobaList.add(indexpertamaParameter);
        CobaList.add(indexkeduaParameter);

        //bedakan (Sebagai Contoh
        List<Set<String>> iniListSet=new ArrayList<>();
        iniListSet.add(indexpertamaParameter);
        iniListSet.retainAll(ListPenampung.get(0));
        //Tidak Bisa iniListSet=ListPenampung.get(0);
        //Tidak Bisa iniListSet.add("IniListSet");

        List<String> iniListTanpaSet=new ArrayList<>();
        iniListTanpaSet.addAll(indexkeduaParameter);
        iniListTanpaSet.add("IniListTanpaSet");
        iniListTanpaSet.retainAll(ListPenampung.get(0));
        //Tidak Bisa Get iniListTanpaSet=iniListSet.get(0);
        //Tidak Bisa Add Suatu Set String iniListTanpaSet.add(indexkeduaParameter);

        Set<String> iniSetSaja= new HashSet<>();
        iniSetSaja.addAll(indexpertamaParameter);
        iniSetSaja.addAll(indexkeduaParameter);
        iniSetSaja.add("IniSetaja");
        iniSetSaja=iniListSet.get(0); //abu-abu
        iniSetSaja=iniListSet.get(1); //abu-abu
        iniSetSaja=indexpertamaParameter; //abu-abu
        //Tidak Bisa Melakukan Get Terhadap List tanppa Set iniSetSaja=iniListTanpaSet.get(0);
        //Tidak Bisa Add Suatu String iniSetSaja.add(indexpertamaParameter);

        Set<String>iniSetAjaYangKedua=new HashSet<>();
        iniSetAjaYangKedua.addAll(iniSetSaja); //Bisa Mengambil Nilai Set Lain Dengan Addall Tetapi tidak Add
        iniSetAjaYangKedua=iniSetSaja; //Tidak Bisa Get dari set lain dikarenakan Set Tidak Memiliki Index
        iniSetAjaYangKedua.toArray();// Bisa Menjadi Array

        HashSet<String>iniHashet=new HashSet<>();
        //Harus Add Sesama Hashet iniHashet.add(indexkeduaParameter);
        iniHashet.add("oke");
        iniHashet.addAll(indexkeduaParameter);


        LinkedHashSet<String> iniLinkedHashet= new LinkedHashSet<>();

        List<List<String>>ListListVector=new Vector<>();
        List<List<String>>ListListArrayList=new ArrayList<>();

            List<List<String>>COBAAA=new ArrayList<>();
        //tidak bisa COBAAA.add(Irisan.retainAll(ListPenampung.get(1)));
        //tidak bisa COBAAA=Irisan.retainAll(ListPenampung.get(1));

        //Bedakan (Sebagai Contoh) */

        //Set <String> Merupakan Kesatuan artinya tidak memiiki index tertentu
        //ArrayList Bersifat Dinamis Artinya Panjang suatu array menyesuaikan perubahan dari suatu Ekspresi

        Set<String>Irisan = ListPenampung.get(1);//deklarasi Irisan sebagai index pertama untuk looping.

        Set<String>Gabungan=new HashSet<>();
        Set<String>PenampungSetiapKeadaanBaikIrisanAtaupunTidak=new HashSet<>();


        List<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1=new ArrayList<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1.addAll(indexpertamaParameter);

        List<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2=new ArrayList<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2.addAll(indexkeduaParameter);

        List<String>UtamaTampilan=new ArrayList<>();//

        for (int i=1; i<bataslooping;i++){
            teta[i]=1-gejalaPenyakit[i];
        }

        for (int i=2;  i< bataslooping   ; i++){
            Irisan.retainAll(ListPenampung.get(i)); //Irisan secara berulang sesuai
            Gabungan.addAll(ListPenampung.get(i));//Seharusnya beririsan lagi dengan i
            if (!Irisan.isEmpty()){
                if (i==2){
                    Irisan.addAll(Irisan);
                    PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(Irisan); //Set Menampung Set
                    int a=i-1;
                    int b=i;
                    hasil=((gejalaPenyakit[a]*gejalaPenyakit[b])+(gejalaPenyakit[a]*teta[b]) + (gejalaPenyakit[b]*teta[a]));
                    hasilteta=1-hasil;
                }else{
                    Irisan.retainAll(UtamaTampilan);
                    PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(Irisan);
                    hasil=(hasil*gejalaPenyakit[i])+(hasil*teta[i])+(gejalaPenyakit[i]*hasilteta);
                    hasilteta=1-hasil;
                }
                UtamaTampilan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak); //List Tanpa Set Menampung Set
            }
            else if (Irisan.isEmpty()){ //ketika tidak beririsan maka himpunan ListPenampung Dipilih salah satu
                if (i==2){
                    int a=i-1;
                    int b=i;
                    nilaiK=(gejalaPenyakit[a]*gejalaPenyakit[b]);
                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK));
                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK));

                    if (nilai1<=nilai2){        //Keadaan terpenuhi Muncul nilai dari (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
                        SortingNilaiterbesar=nilai2;//Contoh Feline Leukimia (Gejala 20)
                        UtamaTampilan.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2); //List Tanpa Set addAll List Tanpa Set
                    }
                    else if (nilai1>=nilai2){      //Keadaan terpenuhi Tidak Muncul (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
                        SortingNilaiterbesar=nilai1;
                        UtamaTampilan.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1);//Contoh Pyometra (Gejala 19)
                    }
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;

                }
                else{ //index mulai melebihi dua himpunan Gabuungan (int c, int d, int e).
                    nilaiK=hasil*gejalaPenyakit[i];
                    nilai1=(hasil*teta[i])/(1-nilaiK);
                    nilai2=(gejalaPenyakit[i]*hasilteta)/(1-nilaiK);

                    if (nilai1<=nilai2){
                        SortingNilaiterbesar=nilai2;

                        //Rencana Berisi PenampungKeadaanBaikIrisanAtaupunTidak

                    }else{
                        SortingNilaiterbesar=nilai1;

                        //maka PenampungKeadaanBaikIrisanAtaupunTidak akan menampung get(i)
                    }
                    hasil=SortingNilaiterbesar;
                }
            }
        } //
        txtHasilDiagnosa.setText( hasil*100+ "%" + UtamaTampilan );
    }

    public void newgaabungan22(int c, int d){
        int urut1 = 0;
        int urut2= 0;

        List<Integer> Urutan=new ArrayList<>();
        Urutan.add(c);
        Urutan.add(d);

        Collections.sort(Urutan); //Mengurutkan Index2 Pada List Urutan.

        urut1=Urutan.get(0);
        urut2=Urutan.get(1);

        //Irisan Himpunan
        Set<String> Gejala0=new HashSet<String >();
        Gejala0.add("KOSONG");
        Set<String> Gejala1 = new HashSet<String>();
        Gejala1.add("Feline Infectous Peritonitis"); //p1
        Gejala1.add("Konstipasi"); //p10
        Set<String> Gejala2 = new HashSet<String>();
        Gejala2.add("Feline Infectous Peritonitis"); //p1
        Gejala2.add("Rhinotracheitis"); //p2
        Gejala2.add("Calcivirus"); //p3
        Gejala2.add("Feline Panleukopia"); //p4
        Gejala2.add("Chlamydia"); //p7
        Gejala2.add("Rabies");//P11
        Gejala2.add("Pyometra");//P14
        Gejala2.add("Leukimia"); //P15
        Set<String> Gejala3 = new HashSet<String>();
        Gejala3.add("Feline Infectous Peritonitis"); //p1
        Gejala3.add("Feline Panleukopia"); //p4
        Gejala3.add("Flutd"); //p9
        Gejala3.add("Hepatitis"); //p12
        Gejala3.add("Gagal ginjal"); //p13
        Gejala3.add("Pyometra"); //p14
        Set<String> Gejala4 = new HashSet<String>();
        Gejala4.add("Rhinotracheitis"); //p2
        Set<String> Gejala5 = new HashSet<String>();
        Gejala5.add("Rhinotracheitis"); //p2
        Gejala5.add("Calcivirus"); //p3
        Gejala5.add("Flutd"); //p9
        Gejala5.add("Konstipasi");//p10
        Gejala5.add("Rabies"); //p11
        Gejala5.add("Hepatitis"); //p12
        Gejala5.add("Gagal Ginjal");//p13
        Gejala5.add("Feline Leukimia");//p15
        Set<String> Gejala6 = new HashSet<String>();
        Gejala6.add("Calcivirus");
        Set<String> Gejala7 = new HashSet<String>();
        Gejala7.add("Feline Panleukopia");
        Gejala7.add("Cacingan");
        Set<String> Gejala8 = new HashSet<String>();
        Gejala8.add("Jamur");
        Gejala8.add("Scabies");
        Set<String> Gejala9 = new HashSet<String>();
        Gejala9.add("Jamur"); //p5
        Gejala9.add("Cacingan"); //p6
        Gejala9.add("Scabies"); //p8
        Set<String> Gejala10 = new HashSet<String>();
        Gejala10.add("Jamur");
        Set<String> Gejala11 = new HashSet<String>();
        Gejala11.add("Cacingan"); //p6
        Set<String> Gejala12 = new HashSet<String>();
        Gejala12.add("Chlamydia");
        Set<String> Gejala13 = new HashSet<String>();
        Gejala13.add("Scabies");
        Set<String> Gejala14 = new HashSet<String>();
        Gejala14.add("Konstipasi"); //p10
        Set<String> Gejala15 = new HashSet<String>();
        Gejala15.add("Rabies"); //p11
        Set<String> Gejala16 = new HashSet<String>();
        Gejala16.add("Flutd"); //p9
        Set<String> Gejala17 = new HashSet<String>();
        Gejala17.add("Hepatitis");
        Set<String> Gejala18 = new HashSet<String>();
        Gejala18.add("Gagal Ginjal");
        Set<String> Gejala19 = new HashSet<String>();
        Gejala19.add("Pyometra");
        Set<String> Gejala20 = new HashSet<String>();
        Gejala20.add("Feline Leukimia");

        List<Set<String>> ListGejalaUntukIndexParameterClass = new ArrayList<>(); //penampung yang akan diindeksasikan
        ListGejalaUntukIndexParameterClass.add(Gejala0);
        ListGejalaUntukIndexParameterClass.add(Gejala1); //Cara memanggil ListGejalaUntukIndexParameter.get(1)
        ListGejalaUntukIndexParameterClass.add(Gejala2);
        ListGejalaUntukIndexParameterClass.add(Gejala3);
        ListGejalaUntukIndexParameterClass.add(Gejala4);
        ListGejalaUntukIndexParameterClass.add(Gejala5);
        ListGejalaUntukIndexParameterClass.add(Gejala6);
        ListGejalaUntukIndexParameterClass.add(Gejala7);
        ListGejalaUntukIndexParameterClass.add(Gejala8);
        ListGejalaUntukIndexParameterClass.add(Gejala9);
        ListGejalaUntukIndexParameterClass.add(Gejala10);
        ListGejalaUntukIndexParameterClass.add(Gejala11);
        ListGejalaUntukIndexParameterClass.add(Gejala12);
        ListGejalaUntukIndexParameterClass.add(Gejala13);
        ListGejalaUntukIndexParameterClass.add(Gejala14);
        ListGejalaUntukIndexParameterClass.add(Gejala15);
        ListGejalaUntukIndexParameterClass.add(Gejala16);
        ListGejalaUntukIndexParameterClass.add(Gejala17);
        ListGejalaUntukIndexParameterClass.add(Gejala18);
        ListGejalaUntukIndexParameterClass.add(Gejala19);
        ListGejalaUntukIndexParameterClass.add(Gejala20);

        Set<String> indexpertamaParameter =ListGejalaUntukIndexParameterClass.get(urut1) ; //fungsi pemanggilan Posisi ListGejala Berdasarkan Parameter
        Set<String> indexkeduaParameter = ListGejalaUntukIndexParameterClass.get(urut2);

        List<Set<String>> ListPenampung = new ArrayList<>(); //list tidak Mampu membaca GET.(0)
        ListPenampung.add(indexpertamaParameter); //sebagai nol
        ListPenampung.add(indexkeduaParameter);

        //Set <String> Merupakan Kesatuan artinya tidak memiiki index tertentu
        //ArrayList Bersifat Dinamis Artinya Panjang suatu array menyesuaikan perubahan dari suatu Ekspresi

        Set<String>Irisan=ListPenampung.get(0);//deklarasi Irisan sebagai index pertama untuk looping.
        Set<String>PenampungNilaiIrisanJikaIrisanBernilaiNULL=new HashSet<>();

        Set<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1=new HashSet<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1.addAll(indexpertamaParameter);

        Set<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2=new HashSet<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2.addAll(indexkeduaParameter);

        Set<String>UtamaTampilan=new HashSet<>();//


        //Perhitungan
        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70,
                0.70,0.35,0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[urut1],Bobot[urut2]}; //index 0, 1 ,2
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;
        double nilaiSatuKurangK=0;



        for (int i=1; i<bataslooping;i++){
            teta[i]=1-gejalaPenyakit[i];
        }
        //ListPenampung.get(i).retainAll(Irisan);
        //StringKeadaanTidakBeririsan.addAll(ListPenampung.get(i));
        for (int i=1;  i< bataslooping   ; i++){
            Irisan.retainAll(ListPenampung.get(i)); //Irisan secara berulang antara dua Himpunan
            if (!Irisan.isEmpty()){ //Ber-irisan Himpunan pada Himpunan 1 dan dua
                if (i==1){
                    int a=i-1;
                    int b=i;
                    hasil=((gejalaPenyakit[a]*gejalaPenyakit[b])+(gejalaPenyakit[a]*teta[b]) + (gejalaPenyakit[b]*teta[a]));
                    hasilteta=1-hasil;
                    Irisan.addAll(PenampungNilaiIrisanJikaIrisanBernilaiNULL); //Penyimpan Jika Kondisi Berirsan kemudian Tidak Beririsan
                }
                hasil=(hasil*gejalaPenyakit[i])+(hasil*teta[i])+(gejalaPenyakit[i]*hasilteta); //Ber-irisan Himpunan pada Himpunan ke i.
                hasilteta=1-hasil;

            }
            else if (Irisan.isEmpty()){ //ketika tidak beririsan maka himpunan ListPenampung Dipilih salah satu
                if (i==1){//Tidak Ber-irisan Untuk kasus Himpunan 1 dan 2 (Akan dipilih salah satunya)
                    int a=i-1;
                    int b=i;
                    nilaiK=(gejalaPenyakit[a]*gejalaPenyakit[b]);
                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK));
                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK));

                    if (nilai1<=nilai2){ //Tidak Ber-irisan Untuk kasus Himpunan 1 dan 2 (Yang dipilih Himpunan kedua dijadikan sebagai irisan)
                        SortingNilaiterbesar=nilai2;
                        //Irisan.clear();
                        //Irisan.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2);
                        //PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(Irisan);
                        PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2);
                    }
                    else { //Tidak Ber-irisan Untuk kasus Himpunan 1 dan 2 (Yang dipilih Himpunan kesatu dijadikan sebagai irisan)
                        SortingNilaiterbesar=nilai1;
                        //Irisan.clear();
                        //Irisan.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1);
                        //PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(Irisan);
                        PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1);
                    }
                    Irisan.addAll(PenampungNilaiIrisanJikaIrisanBernilaiNULL);
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;
                }
                nilaiK=hasil*gejalaPenyakit[i];
                nilai1=(hasil*teta[i])/(1-nilaiK);
                nilai2=(gejalaPenyakit[i]*hasilteta)/(1-nilaiK);

                if (nilai1<=nilai2){
                    SortingNilaiterbesar=nilai2;
                    Irisan.clear();
                    Irisan.addAll(PenampungNilaiIrisanJikaIrisanBernilaiNULL);
                    //Irisan=new HashSet<>(PenampungNilaiIrisanJikaIrisanBernilaiNULL);

                }else{
                    SortingNilaiterbesar=nilai1; //paling akhir
                    Irisan.clear();
                    Irisan.addAll(ListPenampung.get(i));
                    //Irisan=(ListPenampung.get(i));
                }
                hasil=SortingNilaiterbesar;
                hasilteta=1-hasil;
            }
            UtamaTampilan.addAll(Irisan);
        } //
        txtHasilDiagnosa.setText( hasil*100+ "%" + UtamaTampilan );
    }

    public void newgaabungan33(int c, int d, int e){
        int urut1 = 0;
        int urut2= 0;
        int urut3=0;

        List<Integer> Urutan=new ArrayList<>();
        Urutan.add(c);
        Urutan.add(d);
        Urutan.add(e);

        Collections.sort(Urutan); //Mengurutkan Index2 Pada List Urutan.

        urut1=Urutan.get(0);
        urut2=Urutan.get(1);
        urut3=Urutan.get(2);




        //Irisan Himpunan
        Set<String> Gejala0=new HashSet<String >();
        Gejala0.add("KOSONG");


        Set<String> Gejala1 = new HashSet<String>();
        Gejala1.add("Feline Infectous Peritonitis"); //p1
        Gejala1.add("Konstipasi"); //p10


        Set<String> Gejala2 = new HashSet<String>();
        Gejala2.add("Feline Infectous Peritonitis"); //p1
        Gejala2.add("Rhinotracheitis"); //p2
        Gejala2.add("Calcivirus"); //p3
        Gejala2.add("Feline Panleukopia"); //p4
        Gejala2.add("Chlamydia"); //p7
        Gejala2.add("Rabies");//P11
        Gejala2.add("Pyometra");//P14
        Gejala2.add("Leukimia"); //P15


        Set<String> Gejala3 = new HashSet<String>();
        Gejala3.add("Feline Infectous Peritonitis"); //p1
        Gejala3.add("Feline Panleukopia"); //p4
        Gejala3.add("Flutd"); //p9
        Gejala3.add("Hepatitis"); //p12
        Gejala3.add("Gagal ginjal"); //p13
        Gejala3.add("Pyometra"); //p14


        Set<String> Gejala4 = new HashSet<String>();
        Gejala4.add("Rhinotracheitis"); //p2
        Set<String> Gejala5 = new HashSet<String>();
        Gejala5.add("Rhinotracheitis"); //p2
        Gejala5.add("Calcivirus"); //p3
        Gejala5.add("Flutd"); //p9
        Gejala5.add("Konstipasi");//p10
        Gejala5.add("Rabies"); //p11
        Gejala5.add("Hepatitis"); //p12
        Gejala5.add("Gagal Ginjal");//p13
        Gejala5.add("Feline Leukimia");//p15
        Set<String> Gejala6 = new HashSet<String>();
        Gejala6.add("Calcivirus");
        Set<String> Gejala7 = new HashSet<String>();
        Gejala7.add("Feline Panleukopia");
        Gejala7.add("Cacingan");
        Set<String> Gejala8 = new HashSet<String>();
        Gejala8.add("Jamur");
        Gejala8.add("Scabies");
        Set<String> Gejala9 = new HashSet<String>();
        Gejala9.add("Jamur"); //p5
        Gejala9.add("Cacingan"); //p6
        Gejala9.add("Scabies"); //p8
        Set<String> Gejala10 = new HashSet<String>();
        Gejala10.add("Jamur");
        Set<String> Gejala11 = new HashSet<String>();
        Gejala11.add("Cacingan"); //p6
        Set<String> Gejala12 = new HashSet<String>();
        Gejala12.add("Chlamydia");
        Set<String> Gejala13 = new HashSet<String>();
        Gejala13.add("Scabies");
        Set<String> Gejala14 = new HashSet<String>();
        Gejala14.add("Konstipasi"); //p10
        Set<String> Gejala15 = new HashSet<String>();
        Gejala15.add("Rabies"); //p11
        Set<String> Gejala16 = new HashSet<String>();
        Gejala16.add("Flutd"); //p9
        Set<String> Gejala17 = new HashSet<String>();
        Gejala17.add("Hepatitis");
        Set<String> Gejala18 = new HashSet<String>();
        Gejala18.add("Gagal Ginjal");
        Set<String> Gejala19 = new HashSet<String>();
        Gejala19.add("Pyometra");
        Set<String> Gejala20 = new HashSet<String>();
        Gejala20.add("Feline Leukimia");

        List<Set<String>> ListGejalaUntukIndexParameterClass = new ArrayList<>(); //penampung yang akan diindeksasikan
        ListGejalaUntukIndexParameterClass.add(Gejala0);
        ListGejalaUntukIndexParameterClass.add(Gejala1); //Cara memanggil ListGejalaUntukIndexParameter.get(1)
        ListGejalaUntukIndexParameterClass.add(Gejala2);
        ListGejalaUntukIndexParameterClass.add(Gejala3);
        ListGejalaUntukIndexParameterClass.add(Gejala4);
        ListGejalaUntukIndexParameterClass.add(Gejala5);
        ListGejalaUntukIndexParameterClass.add(Gejala6);
        ListGejalaUntukIndexParameterClass.add(Gejala7);
        ListGejalaUntukIndexParameterClass.add(Gejala8);
        ListGejalaUntukIndexParameterClass.add(Gejala9);
        ListGejalaUntukIndexParameterClass.add(Gejala10);
        ListGejalaUntukIndexParameterClass.add(Gejala11);
        ListGejalaUntukIndexParameterClass.add(Gejala12);
        ListGejalaUntukIndexParameterClass.add(Gejala13);
        ListGejalaUntukIndexParameterClass.add(Gejala14);
        ListGejalaUntukIndexParameterClass.add(Gejala15);
        ListGejalaUntukIndexParameterClass.add(Gejala16);
        ListGejalaUntukIndexParameterClass.add(Gejala17);
        ListGejalaUntukIndexParameterClass.add(Gejala18);
        ListGejalaUntukIndexParameterClass.add(Gejala19);
        ListGejalaUntukIndexParameterClass.add(Gejala20);

        Set<String> indexpertamaParameter =ListGejalaUntukIndexParameterClass.get(urut1) ; //fungsi pemanggilan Posisi ListGejala Berdasarkan Parameter
        Set<String> indexkeduaParameter = ListGejalaUntukIndexParameterClass.get(urut2);
        Set<String> indexketigaParameter = ListGejalaUntukIndexParameterClass.get(urut3);

        List<Set<String>> ListPenampung = new ArrayList<>(); //list tidak Mampu membaca GET.(0)
        ListPenampung.add(indexpertamaParameter); //sebagai nol
        ListPenampung.add(indexkeduaParameter);
        ListPenampung.add(indexketigaParameter);


        //Set <String> Merupakan Kesatuan artinya tidak memiiki index tertentu
        //ArrayList Bersifat Dinamis Artinya Panjang suatu array menyesuaikan perubahan dari suatu Ekspresi

        Set<String>Irisan =ListPenampung.get(0);//deklarasi Irisan sebagai index pertama untuk looping.
        Set<String>PenampungNilaiIrisanJikaIrisanBernilaiNULL=new HashSet<>();



        Set<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1=new HashSet<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1.addAll(indexpertamaParameter);

        Set<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2=new HashSet<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2.addAll(indexkeduaParameter);


        //Perhitungan
        String Himpunan1[]={"a","b"};
        String Himpunan2[]={"a","c"};
        String Himpunan3[]={"e","f"};


       // String healthMessagesAll = ArrayUtils.addAll(healthMessages1,healthMessages2);
        //String Listgabungan[]={Himpunan1[],Himpunan2[]};
        //cari cara simpan array dalam array
        //

        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70,
                0.70,0.35,0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[urut1],Bobot[urut2], Bobot[urut3]}; //index 0, 1 ,2
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;

        //irisan string array biasa himpunan 1 dan himpunan 2.

        Set<String>UtamaTampilan=new HashSet<>();//

        for (int i=1; i<bataslooping;i++){
            teta[i]=1-gejalaPenyakit[i];
        }
        //a b c d
        //x yang akan berulang ==irisan

        // selau menyimpan nilai irisan sebelum diretain z
        //
        //a.retainAll (b)
        //a.addAll(a);
        //ListPenampung.get(i).retainAll(Irisan);
        //StringKeadaanTidakBeririsan.addAll(ListPenampung.get(i));
        for (int i=1;  i< bataslooping   ; i++){
            //Irisan (himpunan x dan himpunan y);
            Irisan.retainAll(ListPenampung.get(i)); //Irisan secara berulang antara dua Himpunan
            if (!Irisan.isEmpty()){ //Ber-irisan Himpunan pada Himpunan 1 dan dua
                if (i==1){
                    int a=i-1;
                    int b=i;
                    hasil=((gejalaPenyakit[a]*gejalaPenyakit[b])+(gejalaPenyakit[a]*teta[b]) + (gejalaPenyakit[b]*teta[a]));
                    hasilteta=1-hasil;
                    //hasil irisan
                    Irisan.addAll(Irisan); //Penyimpan Jika Kondisi Berirsan kemudian Tidak Beririsan
                }
                hasil=(hasil*gejalaPenyakit[i])+(hasil*teta[i])+(gejalaPenyakit[i]*hasilteta); //Ber-irisan Himpunan pada Himpunan ke i.
                hasilteta=1-hasil;
            }
            else if (Irisan.isEmpty()){ //ketika tidak beririsan maka himpunan ListPenampung Dipilih salah satu
                if (i==1){ //Tidak Ber-irisan Untuk kasus Himpunan 1 dan 2 (Akan dipilih salah satunya)
                    int a=i-1;
                    int b=i;
                    nilaiK=(gejalaPenyakit[a]*gejalaPenyakit[b]);
                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK));
                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK));

                    if (nilai1<=nilai2){ //Tidak Ber-irisan Untuk kasus Himpunan 1 dan 2 (Yang dipilih Himpunan kedua dijadikan sebagai irisan)
                        SortingNilaiterbesar=nilai2;
                        PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2);
                    }
                    else if (nilai1>=nilai2){ //Tidak Ber-irisan Untuk kasus Himpunan 1 dan 2 (Yang dipilih Himpunan kesatu dijadikan sebagai irisan)
                        SortingNilaiterbesar=nilai1;
                        PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1);
                    }
                    Irisan.addAll(PenampungNilaiIrisanJikaIrisanBernilaiNULL);
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;
                }
                nilaiK=hasil*gejalaPenyakit[i];
                nilai1=(hasil*teta[i])/(1-nilaiK);
                nilai2=(gejalaPenyakit[i]*hasilteta)/(1-nilaiK);

                if (nilai1<=nilai2){
                    SortingNilaiterbesar=nilai2;
                    PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(PenampungNilaiIrisanJikaIrisanBernilaiNULL);
                    //Irisan=new HashSet<>(PenampungNilaiIrisanJikaIrisanBernilaiNULL)
                }else{
                    SortingNilaiterbesar=nilai1; //paling akhir
                    PenampungNilaiIrisanJikaIrisanBernilaiNULL.addAll(ListPenampung.get(i));
                    //Irisan=(ListPenampung.get(i));
                }
                Irisan.addAll(PenampungNilaiIrisanJikaIrisanBernilaiNULL);
                hasil=SortingNilaiterbesar;
                hasilteta=1-hasil;
            }
            UtamaTampilan.addAll(Irisan);
        } //
        txtHasilDiagnosa.setText( hasil*100+ "%" + UtamaTampilan );
    }

    public void newgaabungan333(int c, int d,int e){
        int urut1 = 0;
        int urut2= 0;
        int urut3=0;

        List<Integer> Urutan=new ArrayList<>();
        Urutan.add(c);
        Urutan.add(d);
        Urutan.add(e);

        Collections.sort(Urutan); //Mengurutkan Index2 Pada List Urutan.

        urut1=Urutan.get(0);
        urut2=Urutan.get(1);
        urut3=Urutan.get(2);


        //Irisan Himpunan
        Set<String> Gejala0=new HashSet<String >();
        Gejala0.add("KOSONG");
        Set<String> Gejala1 = new HashSet<String>();
        Gejala1.add("Feline Infectous Peritonitis"); //p1
        Gejala1.add("Konstipasi"); //p10
        Set<String> Gejala2 = new HashSet<String>();
        Gejala2.add("Feline Infectous Peritonitis"); //p1
        Gejala2.add("Rhinotracheitis"); //p2
        Gejala2.add("Calcivirus"); //p3
        Gejala2.add("Feline Panleukopia"); //p4
        Gejala2.add("Chlamydia"); //p7
        Gejala2.add("Rabies");//P11
        Gejala2.add("Pyometra");//P14
        Gejala2.add("Leukimia"); //P15
        Set<String> Gejala3 = new HashSet<String>();
        Gejala3.add("Feline Infectous Peritonitis"); //p1
        Gejala3.add("Feline Panleukopia"); //p4
        Gejala3.add("Flutd"); //p9
        Gejala3.add("Hepatitis"); //p12
        Gejala3.add("Gagal ginjal"); //p13
        Gejala3.add("Pyometra"); //p14
        Set<String> Gejala4 = new HashSet<String>();
        Gejala4.add("Rhinotracheitis"); //p2
        Set<String> Gejala5 = new HashSet<String>();
        Gejala5.add("Rhinotracheitis"); //p2
        Gejala5.add("Calcivirus"); //p3
        Gejala5.add("Flutd"); //p9
        Gejala5.add("Konstipasi");//p10
        Gejala5.add("Rabies"); //p11
        Gejala5.add("Hepatitis"); //p12
        Gejala5.add("Gagal Ginjal");//p13
        Gejala5.add("Feline Leukimia");//p15
        Set<String> Gejala6 = new HashSet<String>();
        Gejala6.add("Calcivirus");
        Set<String> Gejala7 = new HashSet<String>();
        Gejala7.add("Feline Panleukopia");
        Gejala7.add("Cacingan");
        Set<String> Gejala8 = new HashSet<String>();
        Gejala8.add("Jamur");
        Gejala8.add("Scabies");
        Set<String> Gejala9 = new HashSet<String>();
        Gejala9.add("Jamur"); //p5
        Gejala9.add("Cacingan"); //p6
        Gejala9.add("Scabies"); //p8
        Set<String> Gejala10 = new HashSet<String>();
        Gejala10.add("Jamur");
        Set<String> Gejala11 = new HashSet<String>();
        Gejala11.add("Cacingan"); //p6
        Set<String> Gejala12 = new HashSet<String>();
        Gejala12.add("Chlamydia");
        Set<String> Gejala13 = new HashSet<String>();
        Gejala13.add("Scabies");
        Set<String> Gejala14 = new HashSet<String>();
        Gejala14.add("Konstipasi"); //p10
        Set<String> Gejala15 = new HashSet<String>();
        Gejala15.add("Rabies"); //p11
        Set<String> Gejala16 = new HashSet<String>();
        Gejala16.add("Flutd"); //p9
        Set<String> Gejala17 = new HashSet<String>();
        Gejala17.add("Hepatitis");
        Set<String> Gejala18 = new HashSet<String>();
        Gejala18.add("Gagal Ginjal");
        Set<String> Gejala19 = new HashSet<String>();
        Gejala19.add("Pyometra");
        Set<String> Gejala20 = new HashSet<String>();
        Gejala20.add("Feline Leukimia");

        List<Set<String>> ListGejalaUntukIndexParameterClass = new ArrayList<>(); //penampung yang akan diindeksasikan
        ListGejalaUntukIndexParameterClass.add(Gejala0);
        ListGejalaUntukIndexParameterClass.add(Gejala1); //Cara memanggil ListGejalaUntukIndexParameter.get(1)
        ListGejalaUntukIndexParameterClass.add(Gejala2);
        ListGejalaUntukIndexParameterClass.add(Gejala3);
        ListGejalaUntukIndexParameterClass.add(Gejala4);
        ListGejalaUntukIndexParameterClass.add(Gejala5);
        ListGejalaUntukIndexParameterClass.add(Gejala6);
        ListGejalaUntukIndexParameterClass.add(Gejala7);
        ListGejalaUntukIndexParameterClass.add(Gejala8);
        ListGejalaUntukIndexParameterClass.add(Gejala9);
        ListGejalaUntukIndexParameterClass.add(Gejala10);
        ListGejalaUntukIndexParameterClass.add(Gejala11);
        ListGejalaUntukIndexParameterClass.add(Gejala12);
        ListGejalaUntukIndexParameterClass.add(Gejala13);
        ListGejalaUntukIndexParameterClass.add(Gejala14);
        ListGejalaUntukIndexParameterClass.add(Gejala15);
        ListGejalaUntukIndexParameterClass.add(Gejala16);
        ListGejalaUntukIndexParameterClass.add(Gejala17);
        ListGejalaUntukIndexParameterClass.add(Gejala18);
        ListGejalaUntukIndexParameterClass.add(Gejala19);
        ListGejalaUntukIndexParameterClass.add(Gejala20);

        Set<String>IndexKosong=ListGejalaUntukIndexParameterClass.get(0);
        Set<String> indexpertamaParameter =ListGejalaUntukIndexParameterClass.get(urut1) ; //fungsi pemanggilan Posisi ListGejala Berdasarkan Parameter
        Set<String> indexkeduaParameter = ListGejalaUntukIndexParameterClass.get(urut2);
        Set<String> indexketigaParameter=ListGejalaUntukIndexParameterClass.get(urut3);

        List<Set<String>> ListPenampung = new ArrayList<>(); //list tidak Mampu membaca GET.(0)
        ListPenampung.add(IndexKosong); //sebagai nol
        ListPenampung.add(indexpertamaParameter);
        ListPenampung.add(indexkeduaParameter);
        ListPenampung.add(indexketigaParameter);

        Set<String>Irisan = new HashSet<>();
        Irisan.addAll(ListPenampung.get(1));//deklarasi Irisan sebagai index pertama untuk looping.


        Set<String>PenampungSetiapKeadaanBaikIrisanAtaupunTidak=new HashSet<>();


        List<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1=new ArrayList<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1.addAll(indexpertamaParameter);

        List<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2=new ArrayList<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2.addAll(indexkeduaParameter);

        Set<String>UtamaTampilan=new HashSet<>();//


        //Perhitungan
        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70, 0.70,0.35,
                0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[0],Bobot[urut1], Bobot[urut2], Bobot[urut3]}; //012
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;

        for (int i=1; i<bataslooping;i++){
            teta[i]=1-gejalaPenyakit[i];
        }

        for (int i=2;  i< bataslooping   ; i++){
            Irisan.retainAll(ListPenampung.get(i));     //Irisan Akan diiriskan dengan Himpunan Ke i.

            if (!Irisan.isEmpty()){
                if (i==2){
                    int a=i-1;
                    int b=i;
                    hasil=((gejalaPenyakit[a]*gejalaPenyakit[b])+(gejalaPenyakit[a]*teta[b]) + (gejalaPenyakit[b]*teta[a]));
                    hasilteta=1-hasil;
                    PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(Irisan);
                } //Milik ! isEmpety i==2
                    hasil=(hasil*gejalaPenyakit[i])+(hasil*teta[i])+(gejalaPenyakit[i]*hasilteta);
                    hasilteta=1-hasil;
            } //Milik ! isEmpety

            else if (Irisan.isEmpty()){ //ketika tidak beririsan maka himpunan ListPenampung Dipilih salah satu
                if (i==2){
                    int a=i-1;
                    int b=i;
                    nilaiK=(gejalaPenyakit[a]*gejalaPenyakit[b]);
                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK));
                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK));

                    if (nilai1<=nilai2){        //Keadaan terpenuhi Muncul nilai dari (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
                        SortingNilaiterbesar=nilai2;//Contoh Feline Leukimia (Gejala 20)
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2); //List Tanpa Set addAll List Tanpa Set
                    }
                    else if (nilai1>=nilai2){      //Keadaan terpenuhi Tidak Muncul (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
                        SortingNilaiterbesar=nilai1;
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1);//Contoh Pyometra (Gejala 19)
                    }
                    Irisan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak);
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;

                } //Milik  isEmpety I==2
                nilaiK=hasil*gejalaPenyakit[i];
                nilai1=(hasil*teta[i])/(1-nilaiK);
                nilai2=(gejalaPenyakit[i]*hasilteta)/(1-nilaiK);
                //PenampungSetiapKeadaanBaikIrisanAtaupunTidak.clear();
                    if (nilai1<=nilai2){
                        SortingNilaiterbesar=nilai2;
                        //PenampungSetiapKeadaanBaikIrisanAtaupunTidak.clear();
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak);//Prolem Ketika Tidak beririsan disituasi Himpunan ke i
                    }else{
                        SortingNilaiterbesar=nilai1;
                        //PenampungSetiapKeadaanBaikIrisanAtaupunTidak.clear();
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(ListPenampung.get(i));
                        }
                    Irisan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak);
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;
            } //Milik isEmpety

            UtamaTampilan.addAll(Irisan);
        } //Milik For
        txtHasilDiagnosa.setText( hasil*100+ "%" + UtamaTampilan );
    }

    public void newgaabungan222(int c, int d){
        int urut1 = 0;
        int urut2= 0;

        List<Integer> Urutan=new ArrayList<>();
        Urutan.add(c); //add4 dan 5
        Urutan.add(d);

        Collections.sort(Urutan); //Mengurutkan Index2 Pada List Urutan.

        urut1=Urutan.get(0);
        urut2=Urutan.get(1);

        //Perhitungan
        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70, 0.70,0.35,0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[0],Bobot[urut1], Bobot[urut2]}; //012
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;


        //Irisan Himpunan
        Set<String> Gejala0=new HashSet<String >();
        Gejala0.add("KOSONG");

        Set<String> Gejala1 = new HashSet<String>();
        Gejala1.add("Feline Infectous Peritonitis"); //p1
        Gejala1.add("Konstipasi"); //p10

        Set<String> Gejala2 = new HashSet<String>();
        Gejala2.add("Feline Infectous Peritonitis"); //p1
        Gejala2.add("Rhinotracheitis"); //p2
        Gejala2.add("Calcivirus"); //p3
        Gejala2.add("Feline Panleukopia"); //p4
        Gejala2.add("Chlamydia"); //p7
        Gejala2.add("Rabies");//P11
        Gejala2.add("Pyometra");//P14
        Gejala2.add("Leukimia"); //P15

        Set<String> Gejala3 = new HashSet<String>();
        Gejala3.add("Feline Infectous Peritonitis"); //p1
        Gejala3.add("Feline Panleukopia"); //p4
        Gejala3.add("Flutd"); //p9
        Gejala3.add("Hepatitis"); //p12
        Gejala3.add("Gagal ginjal"); //p13
        Gejala3.add("Pyometra"); //p14

        Set<String> Gejala4 = new HashSet<String>();
        Gejala4.add("Rhinotracheitis"); //p2

        Set<String> Gejala5 = new HashSet<String>();
        Gejala5.add("Rhinotracheitis"); //p2
        Gejala5.add("Calcivirus"); //p3
        Gejala5.add("Flutd"); //p9
        Gejala5.add("Konstipasi");//p10
        Gejala5.add("Rabies"); //p11
        Gejala5.add("Hepatitis"); //p12
        Gejala5.add("Gagal Ginjal");//p13
        Gejala5.add("Feline Leukimia");//p15
        Set<String> Gejala6 = new HashSet<String>();
        Gejala6.add("Calcivirus");
        Set<String> Gejala7 = new HashSet<String>();
        Gejala7.add("Feline Panleukopia");
        Gejala7.add("Cacingan");
        Set<String> Gejala8 = new HashSet<String>();
        Gejala8.add("Jamur");
        Gejala8.add("Scabies");
        Set<String> Gejala9 = new HashSet<String>();
        Gejala9.add("Jamur"); //p5
        Gejala9.add("Cacingan"); //p6
        Gejala9.add("Scabies"); //p8
        Set<String> Gejala10 = new HashSet<String>();
        Gejala10.add("Jamur");
        Set<String> Gejala11 = new HashSet<String>();
        Gejala11.add("Cacingan"); //p6
        Set<String> Gejala12 = new HashSet<String>();
        Gejala12.add("Chlamydia");
        Set<String> Gejala13 = new HashSet<String>();
        Gejala13.add("Scabies");
        Set<String> Gejala14 = new HashSet<String>();
        Gejala14.add("Konstipasi"); //p10
        Set<String> Gejala15 = new HashSet<String>();
        Gejala15.add("Rabies"); //p11
        Set<String> Gejala16 = new HashSet<String>();
        Gejala16.add("Flutd"); //p9
        Set<String> Gejala17 = new HashSet<String>();
        Gejala17.add("Hepatitis");
        Set<String> Gejala18 = new HashSet<String>();
        Gejala18.add("Gagal Ginjal");
        Set<String> Gejala19 = new HashSet<String>();
        Gejala19.add("Pyometra");
        Set<String> Gejala20 = new HashSet<String>();
        Gejala20.add("Feline Leukimia");

        List<Set<String>> ListGejalaUntukIndexParameterClass = new ArrayList<>(); //penampung yang akan diindeksasikan
        ListGejalaUntukIndexParameterClass.add(Gejala0);
        ListGejalaUntukIndexParameterClass.add(Gejala1); //Cara memanggil ListGejalaUntukIndexParameter.get(1)
        ListGejalaUntukIndexParameterClass.add(Gejala2);
        ListGejalaUntukIndexParameterClass.add(Gejala3);
        ListGejalaUntukIndexParameterClass.add(Gejala4);
        ListGejalaUntukIndexParameterClass.add(Gejala5);
        ListGejalaUntukIndexParameterClass.add(Gejala6);
        ListGejalaUntukIndexParameterClass.add(Gejala7);
        ListGejalaUntukIndexParameterClass.add(Gejala8);
        ListGejalaUntukIndexParameterClass.add(Gejala9);
        ListGejalaUntukIndexParameterClass.add(Gejala10);
        ListGejalaUntukIndexParameterClass.add(Gejala11);
        ListGejalaUntukIndexParameterClass.add(Gejala12);
        ListGejalaUntukIndexParameterClass.add(Gejala13);
        ListGejalaUntukIndexParameterClass.add(Gejala14);
        ListGejalaUntukIndexParameterClass.add(Gejala15);
        ListGejalaUntukIndexParameterClass.add(Gejala16);
        ListGejalaUntukIndexParameterClass.add(Gejala17);
        ListGejalaUntukIndexParameterClass.add(Gejala18);
        ListGejalaUntukIndexParameterClass.add(Gejala19);
        ListGejalaUntukIndexParameterClass.add(Gejala20);

        Set<String>IndexKosong=ListGejalaUntukIndexParameterClass.get(0);
        Set<String> indexpertamaParameter =ListGejalaUntukIndexParameterClass.get(urut1) ; //fungsi pemanggilan Posisi ListGejala Berdasarkan Parameter
        Set<String> indexkeduaParameter = ListGejalaUntukIndexParameterClass.get(urut2);

        List<Set<String>> ListPenampung = new ArrayList<>(); //list tidak Mampu membaca GET.(0)
        ListPenampung.add(indexpertamaParameter); //sebagai nol
        ListPenampung.add(indexpertamaParameter);
        ListPenampung.add(indexkeduaParameter);

        Set<String>Irisan = ListPenampung.get(1);//deklarasi Irisan sebagai index pertama untuk looping.

        Set<String>Gabungan=new HashSet<>();
        Set<String>PenampungSetiapKeadaanBaikIrisanAtaupunTidak=new HashSet<>();


        List<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1=new ArrayList<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1.addAll(indexpertamaParameter);

        List<String>ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2=new ArrayList<>();
        ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2.addAll(indexkeduaParameter);

        Set<String>UtamaTampilan=new HashSet<>();//

        for (int i=1; i<bataslooping;i++){
            teta[i]=1-gejalaPenyakit[i];
        }

        for (int i=2;  i< bataslooping   ; i++){
            Irisan.retainAll(ListPenampung.get(i)); //Irisan secara berulang sesuai
            Gabungan.addAll(ListPenampung.get(i));//Seharusnya beririsan lagi dengan i
            if (!Irisan.isEmpty()){
                if (i==2){
                    Irisan.addAll(Irisan);
                    PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(Irisan); //Set Menampung Set
                    int a=i-1;
                    int b=i;
                    hasil=((gejalaPenyakit[a]*gejalaPenyakit[b])+(gejalaPenyakit[a]*teta[b]) + (gejalaPenyakit[b]*teta[a]));
                    hasilteta=1-hasil;
                }else{
                    Irisan.retainAll(UtamaTampilan);
                    PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(Irisan);
                    hasil=(hasil*gejalaPenyakit[i])+(hasil*teta[i])+(gejalaPenyakit[i]*hasilteta);
                    hasilteta=1-hasil;
                }
                UtamaTampilan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak); //List Tanpa Set Menampung Set
            }
            else if (Irisan.isEmpty()){ //ketika tidak beririsan maka himpunan ListPenampung Dipilih salah satu
                if (i==2){
                    int a=i-1;
                    int b=i;
                    nilaiK=(gejalaPenyakit[a]*gejalaPenyakit[b]);
                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK));
                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK));

                    if (nilai1<=nilai2){        //Keadaan terpenuhi Muncul nilai dari (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
                        SortingNilaiterbesar=nilai2;//Contoh Feline Leukimia (Gejala 20)
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak2); //List Tanpa Set addAll List Tanpa Set
                    }
                    else if (nilai1>=nilai2){      //Keadaan terpenuhi Tidak Muncul (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
                        SortingNilaiterbesar=nilai1;
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(ListPenampungSetiapKeadaanBaikIrisanAtaupunTidak1);//Contoh Pyometra (Gejala 19)
                    }
                    Irisan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak);
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;

                }
                else{ //index mulai melebihi dua himpunan Gabuungan (int c, int d, int e).
                    nilaiK=hasil*gejalaPenyakit[i];
                    nilai1=(hasil*teta[i])/(1-nilaiK);
                    nilai2=(gejalaPenyakit[i]*hasilteta)/(1-nilaiK);

                    if (nilai1<=nilai2){
                        SortingNilaiterbesar=nilai2;

                        //Rencana Berisi PenampungKeadaanBaikIrisanAtaupunTidak

                    }else{
                        SortingNilaiterbesar=nilai1;

                        //maka PenampungKeadaanBaikIrisanAtaupunTidak akan menampung get(i)
                    }
                    hasil=SortingNilaiterbesar;
                }
            }
            UtamaTampilan.addAll(Irisan);
        } //
        txtHasilDiagnosa.setText( hasil*100+ "%" + UtamaTampilan );
    }



    //Saya ingin ada kelas baru dengan paraameter yang dapat memanggil array himpunan.
    //pemilihan himpunan berdasarkan jumlah checkbox dan checkbox terpilih
    //jika ada 3 checkbox terpilih(gejala terpilih maka akan diiriskan untuk himpunan 1 ke himpunan dua terpilih) hasil irisan di iriskan lagi dengan himpunan berikutnya
    //jika himpunan tidak saling teriris maka dipilih salah satunya untuk dilakukan irisan pada himpunan berikutnya. ( beririsan atau tidak beririsan akan digunakan untuk irisan selanjutnya)
    //Rumus Ketika Beririsan adalah sebagai berikut untuk perulangan i=1    int a=i-1;
    //                    int b=i;
    //                    hasil=((gejalaPenyakit[a]*gejalaPenyakit[b])+(gejalaPenyakit[a]*teta[b]) + (gejalaPenyakit[b]*teta[a]));
    //                    hasilteta=1-hasil;
    //Rumus Ketika Beririsan tetapi i looping lebih dari 1
    //                    hasil=(hasil*gejalaPenyakit[i])+(hasil*teta[i])+(gejalaPenyakit[i]*hasilteta);
   //                     hasilteta=1-hasil;
    //Rumus ketika tidak beririsan dan i looping =1:
    //if (i==1){
    //                    int a=i-1;
    //                    int b=i;
    //                    nilaiK=(gejalaPenyakit[a]*gejalaPenyakit[b]);
    //                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK));
    //                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK));
    //
    //                    if (nilai1<=nilai2){        //Keadaan terpenuhi Muncul nilai dari (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
    //                        SortingNilaiterbesar=nilai2;//Contoh Feline Leukimia (Gejala 20)
    //                    }
    //                    else if (nilai1>=nilai2){      //Keadaan terpenuhi Tidak Muncul (PenampungSetiapKeadaanBaikIrisanAtaupunTidak)
    //                        SortingNilaiterbesar=nilai1;
    //                    }
    //                    hasil=SortingNilaiterbesar;
    //                    hasilteta=1-hasil;
    //                }
    //Rumus ketika tidak beririsan dan i looping lebih dari 1:
    // nilaiK=hasil*gejalaPenyakit[i];
    //                nilai1=(hasil*teta[i])/(1-nilaiK);
    //                nilai2=(gejalaPenyakit[i]*hasilteta)/(1-nilaiK);
    //                //PenampungSetiapKeadaanBaikIrisanAtaupunTidak.clear();
    //                    if (nilai1<=nilai2){
    //                        SortingNilaiterbesar=nilai2;
    //                    }else{
    //                        SortingNilaiterbesar=nilai1;
    //                        }
    //                    hasil=SortingNilaiterbesar;
    //                    hasilteta=1-hasil;
    //dimana kelas akan memanggil himpunan penyakit dari gejala tertentu diiiriskan dengan himpunan berikutnya
    //jika ada n himpunan di checklist(checkbox terpilih) maka looping irisan/pemilihan antara keduanya dilakukan sebanyak n


    public void ManualIrisan3(int c, int d, int e){

        String Gejala1[]={"Feline Infectous Peritonitis","Konstipasi"};
        String Gejala2[]={"Feline Infectous Peritonitis","Rhinotracheitis","Calcivirus","Feline Panleukopia",
                            "Chlamydia","Rabies","Pyometra","Leukimia"};
        String Gejala3[]={"Feline Infectous Peritonitis","Feline Panleukopia","Flutd","Hepatitis","Gagal ginjal",
                            "Pyometra"};
        String Gejala4[]={"Rhinotracheitis"};
        String Gejala5[]={"Rhinotracheitis","Calcivirus","Flutd","Konstipasi","Rabies","Hepatitis",
                            "Gagal Ginjal","Feline Leukimia"};



        List<String[]> Penampung=new ArrayList<>();
        Penampung.add(Gejala1);
        Penampung.add(Gejala2);
        Penampung.add(Gejala3);




        String Gejala6[]={"Calcivirus"};
        String Gejala7[]={"Feline Panleukopia","Cacingan"};
        String Gejala8[]={"Jamur","Scabies"};
        String Gejala9[]={"Jamur","Cacingan","Scabies"};
        String Gejala10[]={"Jamur"};
        String Gejala11[]={"Cacingan"};
        String Gejala12[]={"Chlamydia"};
        String Gejala13[]={"Scabies"};
        String Gejala14[]={"Konstipasi"};
        String Gejala15[]={"Rabies"};
        String Gejala16[]={"Flutd"};
        String Gejala17[]={"Hepatitis"};
        String Gejala18 [] ={"Gagal Ginjal"};
        String Gejala19[]={"Pyometra"};
        String Gejala20[]={"Feline Leukimia"};

        //Perhitungan
        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70, 0.70,0.35,0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[0],Bobot[1], Bobot[2]}; //012
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;


        /*
        String[] firstArray = {"A", "B", "C", "D"};
    String[] secondArray = {"D", "A", "E", "F"};

    HashSet<String> set = new HashSet<>();

    set.addAll(Arrays.asList(firstArray));

    set.retainAll(Arrays.asList(secondArray));

    System.out.println(set);

    //convert to array
    String[] intersection = {};
    intersection = set.toArray(intersection);

    System.out.println(Arrays.toString(intersection));
        * */

    }

    
    //Ketika Button Di klik akan menjalankan kelas berdasarkan seri checkbox yang di ceklist
    public void HasilDiagnosa(View view) {
        ArrayList<Integer> arrayindeks= new ArrayList<Integer>();
        arrayindeks.addAll(arraypenampung);
        int PanjangKelas=arrayindeks.size();

        if (PanjangKelas==0){
            Toast.makeText(DiagnosaActivity.this, "Gejala Tidak Boleh Kosong", Toast.LENGTH_LONG).show();
        }
        else if(PanjangKelas==1){
            Toast.makeText(DiagnosaActivity.this, "Pilih Minimal Dua Gejala", Toast.LENGTH_LONG).show();
        }
        else if (PanjangKelas==2){
            newgaabungan222(arrayindeks.get(0),arrayindeks.get(1));
        }
        else if (PanjangKelas==3){
         newgaabungan333(arrayindeks.get(0),arrayindeks.get(1),arrayindeks.get(2));
        }
        else if (PanjangKelas==4){

        }
        else if (PanjangKelas==5){

        }
        else if (PanjangKelas==6){

        }
        else{
            Toast.makeText(DiagnosaActivity.this, "Terlalu banyak Inputan", Toast.LENGTH_LONG).show();
        }

        }
    }




//List list = Arrays.asList(new String[] { "A", "B", "C", "D" });
//list.set(2, "X");





