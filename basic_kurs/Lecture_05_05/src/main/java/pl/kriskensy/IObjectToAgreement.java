package pl.kriskensy;

//ten interfejs jest po to aby drukowac umowy nie tylko na projekty ale na sprzedaz lub uslugi
//ten interfejs jest po to aby w klasie umowa dzialal funkcja drukuj umowe nie tylko na projekcie
//poniewaz funkcja drukuj umowe w klasie Agreement uzywa funkcji "quotation" to interfejs musi miec te funkcje
//wszystkie obiekty klas ktore beda dziedziczyly po "IObjectToAgreement" i beda mialy funkcje "data" oraz "quotation" beda mogly miec drukowana umowe
interface IObjectToAgreement {

    void data();

    double quotation();
}
