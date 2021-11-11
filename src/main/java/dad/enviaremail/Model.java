package dad.enviaremail;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty smtp = new SimpleStringProperty();
	private StringProperty puerto = new SimpleStringProperty();
	private StringProperty remitente = new SimpleStringProperty();
	private StringProperty contra = new SimpleStringProperty();
	private StringProperty destinatario = new SimpleStringProperty();
	private StringProperty asunto = new SimpleStringProperty();
	private StringProperty mensaje = new SimpleStringProperty();
	
	public final StringProperty smtpProperty() {
		return this.smtp;
	}
	
	public final String getSmtp() {
		return this.smtpProperty().get();
	}
	
	public final void setSmtp(final String smtp) {
		this.smtpProperty().set(smtp);
	}
	
	public final StringProperty puertoProperty() {
		return this.puerto;
	}
	
	public final String getPuerto() {
		return this.puertoProperty().get();
	}
	
	public final void setPuerto(final String puerto) {
		this.puertoProperty().set(puerto);
	}
	
	public final StringProperty remitenteProperty() {
		return this.remitente;
	}
	
	public final String getRemitente() {
		return this.remitenteProperty().get();
	}
	
	public final void setRemitente(final String remitente) {
		this.remitenteProperty().set(remitente);
	}
	
	public final StringProperty contraProperty() {
		return this.contra;
	}
	
	public final String getContra() {
		return this.contraProperty().get();
	}
	
	public final void setContra(final String contra) {
		this.contraProperty().set(contra);
	}
	
	public final StringProperty destinatarioProperty() {
		return this.destinatario;
	}
	
	public final String getDestinatario() {
		return this.destinatarioProperty().get();
	}
	
	public final void setDestinatario(final String destinatario) {
		this.destinatarioProperty().set(destinatario);
	}
	
	public final StringProperty asuntoProperty() {
		return this.asunto;
	}
	
	public final String getAsunto() {
		return this.asuntoProperty().get();
	}
	
	public final void setAsunto(final String asunto) {
		this.asuntoProperty().set(asunto);
	}
	
	public final StringProperty mensajeProperty() {
		return this.mensaje;
	}
	
	public final String getMensaje() {
		return this.mensajeProperty().get();
	}
	
	public final void setMensaje(final String mensaje) {
		this.mensajeProperty().set(mensaje);
	}

}
