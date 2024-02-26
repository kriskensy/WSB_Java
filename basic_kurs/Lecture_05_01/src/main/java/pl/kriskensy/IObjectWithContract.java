package pl.kriskensy;

//ten interfejs powstal tylko po to zeby w klasie Bookkeeping printTransferOrder() dzialalo nie tylko na osobach
// ale na wszystkich obiektach dla ktorych mozna wywolac print() oraz paycheck()

public interface IObjectWithContract {
    void print();
    double paycheck();
}