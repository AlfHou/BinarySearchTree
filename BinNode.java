//TODO: Translate all comments and variables to english.
class BinNode {
    int data;
    BinNode venstre;
    BinNode hoyre;

    public BinNode(int data) {
        this.data = data;
    }
    //Metode som returnerer antall noder i treet.
    public int number() {
        int teller = 1;
        if (venstre != null) {
            teller += venstre.number();
        }
        if (hoyre != null) {
            teller += hoyre.number();
        }
        return teller;
    }
    public int hentData() {
        return data;
    }
    //Metode for å legge til en ny node i treet
    public void leggTil(int data) {
        //Siden data er definert som int holder det å bruke < operatøren for å sammenligne
        //Kan ikke legge til et element som allerede er i treet
        if (data == this.data) {
            //TODO: Remove all return statements and change all if statements in method to else if statements
            return;
        }
        //node er større enn noden vi er i og høyre pekeren IKKE er null, rekursivt kall til høyre
        if (data > this.data && hoyre != null) {
            hoyre.leggTil(data);
            return;
        }
        //node er mindre enn noden vi er i og venstre pekeren IKKe er null, rekursivt kall til venstre
        if (data < this.data && venstre != null) {
            venstre.leggTil(data);
            return;
        }
        //node er større enn noden vi er i og høyre pekeren er null, ny node og høyre pekeren til nåværende node peker på ny node
        if (data > this.data) {
            hoyre = new BinNode(data);
            return;
        }
        //node er større enn noden vi er i og venstre pekeren er null, ny node og venstre pekeren til nåværende node peker på ny node
        if (data < this.data) {
            venstre = new BinNode(data);
            return;
        }
    }
}