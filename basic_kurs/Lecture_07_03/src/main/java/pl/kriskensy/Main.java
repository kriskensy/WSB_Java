package pl.kriskensy;

//program z uzyciem typu generycznego -> BRAK powtarzalnosci kodu
public class Main {
    public static void main(String[] args) {
        System.out.println("przyklad typu generycznego");
        System.out.println();

        //czy ten zbior potrafi przechowywac raz pacjentow, raz lekarzy, itd?

        Collection<Doctor> doctorCollection = new Collection<Doctor>();
        doctorCollection.GetList().add(new Doctor("doc1", "doc_one", "spec1"));
        doctorCollection.GetList().add(new Doctor("doc2", "doc_two", "spec2"));
        doctorCollection.GetList().add(new Doctor("doc3", "doc_three", "spec3"));
        doctorCollection.GetList().add(new Doctor("doc4", "doc_four", "spec4"));
        doctorCollection.GetList().add(new Doctor("doc5", "doc_five", "spec5"));

        System.out.println(doctorCollection.GetList().get(1).GetSurname());

        Collection<Paramedic> paramedicCollection = new Collection<>();
        paramedicCollection.GetList().add(new Paramedic("par1", "para_one", "permi1"));
        paramedicCollection.GetList().add(new Paramedic("par2", "para_two", "permi2"));
        paramedicCollection.GetList().add(new Paramedic("par3", "para_three", "permi3"));
        paramedicCollection.GetList().add(new Paramedic("par4", "para_four", "permi4"));
        paramedicCollection.GetList().add(new Paramedic("par5", "para_five", "permi5"));

        System.out.println(paramedicCollection.GetList().get(2).GetSurname());
    }
}