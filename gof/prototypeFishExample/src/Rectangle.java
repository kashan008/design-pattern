public abstract class Rectangle extends Shape {

  
public boolean equals(Object object) {
  if (this == object) return true;
  if (object == null || getClass() != object.getClass()) return false;
  
  Shape shape = (Shape) object;
  
  return id != null ? id.equals(shape.id) : shape.id == null;
}

   }
