package pl.kriskensy;

public class FinancialParameters {
    public double GetAmountPerBasicContractPatient(){
        return 10; //na szytwno 10 ale normalnie laczenie i pobranie parametru z BD (baza danych)
    }

    public double GetAmountPerSpecialistDoctorAdmittedPatient(){
        return 100;
    }
}