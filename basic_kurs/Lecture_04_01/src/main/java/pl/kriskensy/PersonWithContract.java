package pl.kriskensy;

//po to tworzymy klase abstrakcyjna PersonWithContract, zeby w klasie Bookkeeping funkcja printTransferOrder
// dzialala zarowna dla FamilyDoctor jak i SpecialistDoctor
//ta klasa jest abstrakcyjna poniewaz zawiera funkcje abstrakcyjna paycheck oraz ma abstract z przodu
//jezeli klasa zawiera funkcje abstrakcyjna to musi byc abstrakcyjna.
public abstract class PersonWithContract extends Person {
    public PersonWithContract(String name, String surname) {
        super(name, surname);
    }

    public abstract double paycheck();
}