enum DiscountType{
    Perncetage,
    Amount
}

sealed class Employee permits Manager, Senior, Junior{

}