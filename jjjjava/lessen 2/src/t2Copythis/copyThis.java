package t2Copythis;

public class copyThis {
   private String name;
   private String contry;
   private String [] citys = {"keysarya","hertzeliya","natanya", "ranana"};

    public copyThis(String name, String contry) {
        setName(name);
        setContry(contry);
    }

    public copyThis(copyThis c) {
        this.name = c.name;
        this.contry =c.contry;
        System.arraycopy(c.citys,0,this.citys,0,this.citys.length);
//        for (int i = 0; i < citys.length ; i++) {
//            this.citys[i]=c.citys[i];
//        String [] citys1 = new String [getCitys().length];
//        for (int i = 0; i < citys.length ; i++) {
//            citys1[i]=citys[i];

//        }
    }


    public void ching (){
        citys[0]="chingh";
    }
    public void  print (){
        for (int i = 0; i <citys.length ; i++) {
            System.out.println(citys[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String[] getCitys() {
        return citys;
    }

    public void setCitys(String[] citys) {
        this.citys = citys;
    }
}
