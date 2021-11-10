package co.edu.eam.mytestapp.model.pokemon

class Type (var name:String, var url: String){
    override fun toString(): String {
        return "${name}, ${url}"
    }
}