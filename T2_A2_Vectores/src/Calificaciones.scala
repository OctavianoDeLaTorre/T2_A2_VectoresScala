

object Calificaciones {
  def main(args: Array[String]): Unit = {
    val alumnos = new Array[Array[Double]](4)
    
    alumnos(0) = Array(90,100,90,90,85,90)
    alumnos(1) = Array(85,70,80,100,90,90)
    alumnos(2) = Array(90,90,95,60,90,100)
    alumnos(3) = Array(75,90,80,90,95,90)
    
    println("Promedio Materia: ")
    mostrarVector(promedioMateria(alumnos), "Materia")
    println("Promedio parcial: "+promedioParcial(alumnos))
    println("Promedio generl: "+promedioGeneral(alumnos))
    
    
  }
  
  def promedioMateria (cal:Array[Array[Double]]) : Array[Double] = {
    val promMaterias = new Array[Double](cal.length)
    for(i <- 0 until cal.length){
      for (j <- 0 until cal(i).length) {
        promMaterias(i) += cal(i)(j)
        }
      promMaterias(i) = promMaterias(i)/cal(i).length;
      
    }
    return promMaterias
  }
  
  def promedioParcial(cal:Array[Array[Double]]) : Array[Double] ={
     val promPacial = new Array[Double](cal(0).length)
     for(i <- 0 until cal.length){
       for (j <- 0 until cal(i).length) {
        promPacial(j) += cal(i)(j)
        }
     }
     
     for(i <- 0 until promPacial.length){
       promPacial(i) = promPacial(i) / cal.length
     }
     
     return promPacial
  }
  
  def promedioGeneral(cal:Array[Array[Double]]) : Double ={
     var promGeneral = 0.0
     for(i <- 0 until cal.length){
       for (j <- 0 until cal(i).length) {
         promGeneral += cal(i)(j)
       }
     }
     return promGeneral/(cal.length *  cal(0).length)
  }
  
  def mostrarVector(cal:Array[Double], tipo:String){
    for(i <- 0 until cal.length){
      println(tipo +" "+(i+1)+": "+cal(i) )
    }
  }
}