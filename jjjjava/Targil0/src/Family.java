public class Family {
   private Perents M_dad;
   private Perents M_mam;
   private Cids [] M_ciids;

    public Family(Perents dad, Perents mam, Cids[] ciids) {
        setM_dad(dad);
        setM_mam(mam);
        setM_ciids(ciids);
    }

    public Perents getM_dad() {
        return M_dad;
    }

    public void setM_dad(Perents dad) {
        M_dad = dad;
    }

    public Perents getM_mam() {
        return M_mam;
    }

    public void setM_mam(Perents mam) {
        M_mam = mam;
    }

    public Cids[] getM_ciids() {
        return M_ciids;
    }

    public void setM_ciids(Cids[] ciids) {
        M_ciids = ciids;
    }

    public void tolk(){
        getM_dad().tolk();
        getM_mam().tolk();
        for (int i = 0; i <M_ciids.length ; i++) {
                getM_ciids()[i].tolk();

        }


    }
    public static void play(){
    }


}
