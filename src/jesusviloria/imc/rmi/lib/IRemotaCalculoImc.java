/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jesusviloria.imc.rmi.lib;
import java.rmi.RemoteException;
import java.rmi.Remote;

/**
 *
 * @author jesusviloria
 */
public interface IRemotaCalculoImc extends Remote {
    
    public DatosImc calcularImc(DatosImc datos) throws RemoteException;
    
}
