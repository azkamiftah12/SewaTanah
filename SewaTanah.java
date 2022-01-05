/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewatanah;

/**
 *
 * @author Azka Miftah
 */
public class SewaTanah {
    public double sewa (double luas, double trfpermtr){
        double HargaSewa;
        
        luas= 1000;
        trfpermtr= 2000000;
        HargaSewa = luas * trfpermtr;
        return HargaSewa;
    }
}
