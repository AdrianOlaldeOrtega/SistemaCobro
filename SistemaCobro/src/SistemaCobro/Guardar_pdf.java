package SistemaCobro;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class Guardar_pdf {
    Date Fecha = new Date();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    String fecha = df.format(Fecha);
    String nombreDirector = "English Presstige School ";
    String ruta = "";
    //String fecha = "hoy";
    String rutaImagen = "..\\Imagenes\\logo.jpg";
    List<Datos> dato;

    Document documento = new Document();
    FileOutputStream archivo;
    Paragraph titulo = new Paragraph("Reporte De Alumnos Con Adeudos.");

    public Guardar_pdf(List<Datos> dato, String name)
    {
        this.dato = dato;
        ruta = name;
               
    }
    public void crearPlantilla() {
        try {
            archivo = new FileOutputStream(ruta);
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            documento.add(Chunk.NEWLINE);
            titulo.setAlignment(1);

            Image image = null;
            try {
                image = Image.getInstance(rutaImagen);//carga imagen
                image.scaleAbsolute(150, 100);//cambia tamaño
                image.setAbsolutePosition(415, 750);//coloca imagen en la posicion

            } catch (Exception e) {
            }

            //documento.add(image);//agrega la imagen al documento

            documento.add(titulo);

            documento.add(new Paragraph("Escuela: " + nombreDirector));

            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            PdfPTable tabla = new PdfPTable(7);
            tabla.setWidthPercentage(100);
            PdfPCell id = new PdfPCell(new Phrase("Id"));
            id.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell nombre = new PdfPCell(new Phrase("Nombre"));
            nombre.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell libro = new PdfPCell(new Phrase("Libro"));
            libro.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell inscrip = new PdfPCell(new Phrase("Inscripción"));
            inscrip.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell mens = new PdfPCell(new Phrase("Menusalidad"));
            mens.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell cert = new PdfPCell(new Phrase("Certifiación"));
            cert.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell saldo = new PdfPCell(new Phrase("Saldo"));
            saldo.setBackgroundColor(BaseColor.ORANGE);

            tabla.addCell(id);
            tabla.addCell(nombre);
            tabla.addCell(libro);
            tabla.addCell(inscrip);
            tabla.addCell(mens);
            tabla.addCell(cert);
            tabla.addCell(saldo);

           for(Datos persona: this.dato){
               tabla.addCell(persona.getId());
                tabla.addCell(persona.getNombre());                
                tabla.addCell(persona.getLibro());
                tabla.addCell(persona.getInscripcion());
                tabla.addCell(persona.getMensualidad());
                tabla.addCell(persona.getCertificado());
                tabla.addCell(persona.getSaldo());
            }
           
            documento.add(tabla);
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));

            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {

            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.out.println("aqui");
            System.err.println(e.getMessage());
        }

    }
}
