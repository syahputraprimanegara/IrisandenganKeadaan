    public void gaabungan2(int c, int d){

        int urut1 = 19;
        int urut2=20;
        if (c<=d){
            urut1=c;
            urut2=d;
        }else if (d<=c){
            urut1=d;
            urut2=c;
        }


        double Bobot[]={0.0,0.85,0.40,0.50,0.90,0.40,0.60,0.40,0.60,0.70, 0.70,0.35,0.50,0.50,0.60,0.90,0.40,0.90,0.75,0.90,0.65};
        double gejalaPenyakit[]= {Bobot[urut1], Bobot[urut2]};
        int bataslooping=gejalaPenyakit.length;
        double teta[]=new double[bataslooping];
        double hasil=0;
        double hasilteta=0;
        double nilaiK=0;
        double nilai1=0;
        double nilai2=0;
        double SortingNilaiterbesar=0;

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
        //ListPenampung.add(indexpertamaParameter); //sebagai nol
        ListPenampung.add(indexpertamaParameter);
        ListPenampung.add(indexkeduaParameter);

        Set<String>Irisan = ListPenampung.get(0);//deklarasi Irisan sebagai index pertama untuk looping.

        Set<String>Gabungan=new HashSet<>();
        Set<String>PenampungSetiapKeadaanBaikIrisanAtaupunTidak=new HashSet<>();
        List<String>UtamaTampilan=new ArrayList<>();//

        for (int i=0; i<bataslooping;i++){
            teta[i]=1-gejalaPenyakit[i];
        }

        //ListPenampung.get(i).retainAll(Irisan);
        //StringKeadaanTidakBeririsan.addAll(ListPenampung.get(i));
        for (int i=1;  i< bataslooping   ; i++){
            Irisan.retainAll(ListPenampung.get(i)); //Irisan secara berulang sesuai
            Gabungan.addAll(ListPenampung.get(i));//Seharusnya beririsan lagi dengan i
            if (!Irisan.isEmpty()){
                    if (i==1){
                        Irisan.retainAll(ListPenampung.get(i));
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak.addAll(Irisan);
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
                UtamaTampilan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak);
            }
            else if (Irisan.isEmpty()){ //ketika tidak beririsan maka himpunan ListPenampung Dipilih salah satu
                if (i==1){
                    int a=i-1;
                    int b=i;
                    nilaiK=(gejalaPenyakit[b]*gejalaPenyakit[b]);
                    nilai1=((gejalaPenyakit[a]*teta[b])/(1-nilaiK) );
                    nilai2=((gejalaPenyakit[b]*teta[a])/(1-nilaiK) );
                    if (nilai1>=nilai2){
                        SortingNilaiterbesar=nilai1;
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak=ListPenampung.get(0); //Contoh Pyometra

                    }else {
                        SortingNilaiterbesar=nilai2;
                        PenampungSetiapKeadaanBaikIrisanAtaupunTidak=ListPenampung.get(1); //Contoh Feline Leukimia
                    }
                    UtamaTampilan.addAll(PenampungSetiapKeadaanBaikIrisanAtaupunTidak);
                    hasil=SortingNilaiterbesar;
                    hasilteta=1-hasil;

                }else{


                }
            }
        } //
        txtHasilDiagnosa.setText(hasil*100+ "%" + UtamaTampilan );
    }
