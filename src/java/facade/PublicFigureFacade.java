/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.domain.PublicFigure;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sawad
 */
@Stateless
public class PublicFigureFacade extends AbstractFacade<PublicFigure> {

    @PersistenceContext(unitName = "SchoolCompetitionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PublicFigureFacade() {
        super(PublicFigure.class);
    }
    
}
