object act41 extends App{
    var items = Array("orange", "apple", "banana")
    var quantity = Array(34,14,57)

    def displayInventory():Unit = {
        println("Item  :  Quantity")
        for (i <- items.indices) {
            println(items(i) + "  :  " + quantity(i))
        }
    }
    def restockItem(item:String, nquantity:Integer):Unit={
        val index = items.indexOf(item.toLowerCase())
        if(index != -1){
            quantity(index)  += nquantity
            println(s"${nquantity} ${item} added.")
            println("New List")
            displayInventory()
        }else{
            println("Item not found!")
        }
    }

    def sellItem(item:String, squantity:Integer):Unit ={
        val index = items.indexOf(item.toLowerCase())
        if(index != -1){
            quantity(index) -= squantity
            println(s"${squantity} ${item} sold...")
            println("New List")
            displayInventory()
        }
        else{
            println("Item not found.")
        }
    }
    displayInventory()
    restockItem("Orange",34)
    sellItem("Apple",4)
}