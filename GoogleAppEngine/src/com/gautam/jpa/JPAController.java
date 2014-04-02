/**
 * 
 */
package com.gautam.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gautam.dbentities.SuperheroStore;
import com.gautam.helper.Superhero;

/**
 * @author Gautam Pal
 *
 */
@Controller
public class JPAController {

	@RequestMapping("/")
	@ResponseBody
	public String printHello() {

	    return "<html><head><title>Gautam test</title></head><body><H1>" + Superhero.get() + "</H1></body></html>";
	}

	@RequestMapping("/jpa")
	@ResponseBody
	public String JPATest() {

		EntityManager em = EMF.get().createEntityManager();
		
		SuperheroStore user;
		String success = "Success ";
		
		try {
			
			user = new SuperheroStore();
			 
			user.setUsername(Superhero.get());
			user.setCreatedBy("StanLee");
			user.setCreatedDate(new Date());
			
	        em.persist(user);
	        success += ":added " + user.getUsername();
	        
	    } catch (Exception e) {
	    	success = e.toString();
			e.printStackTrace();
	    } finally {
	        try {
				em.close();
			} catch (Exception e) {
				success += e.toString();
				e.printStackTrace();
			}
	    }
		
	    return "<html><head><title>JPA test</title><meta http-equiv=\"refresh\" content=\"4; url=../jpalist\" /></head><body><h1>" + success + "</h1></body></html>";
	}
	
	@RequestMapping("/jpalist")
	@ResponseBody
	public String JPAList() {

		EntityManager em = EMF.get().createEntityManager();
		
		String prettyPrint = "";
		
		try {
	        
			List<SuperheroStore> allHeroes;
			
	        allHeroes = getAllHeroes(em);
	        for (SuperheroStore hero : allHeroes)
	        {
	        	prettyPrint += (hero + " :: <br>");
	        }
	        
	    } catch (Exception e) {
			e.printStackTrace();
	    } finally {
	        try {
				em.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
		
	    return "<html><head><title>JPA test</title></head><body>" + prettyPrint + "</body></html>";
	}

	private List<SuperheroStore> getAllHeroes(EntityManager em) {
		List<SuperheroStore> allHeroes;
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<SuperheroStore> cq = cb.createQuery(SuperheroStore.class);
		Root<SuperheroStore> heroQuery = cq.from(SuperheroStore.class);
		cq.select(heroQuery);
		TypedQuery<SuperheroStore> q = em.createQuery(cq);
		allHeroes = q.getResultList();
		return allHeroes;
	}
	
	@RequestMapping("/jpa/{name}")
	@ResponseBody
	public String JPAAdd(@PathVariable("name") String name) {

		EntityManager em = EMF.get().createEntityManager();
		
		String success = "Success";
		
		try {
	        
			SuperheroStore user;
			user = new SuperheroStore();
			 
			user.setUsername(name);
			user.setCreatedBy("User");
			user.setCreatedDate(new Date());
			
	        em.persist(user);
	        
	    } catch (Exception e) {
	    	success = e.toString();
			e.printStackTrace();
	    } finally {
	        try {
				em.close();
			} catch (Exception e) {
				success += e.toString();
				e.printStackTrace();
			}
	    }
		
	    return "<html><head><title>JPA test</title><meta http-equiv=\"refresh\" content=\"4; url=../jpalist\" /></head><body><H1>" + success + "</H1></body></html>";
	}
	
	@RequestMapping("/jpaclear")
	@ResponseBody
	public String JPAClear() {
		
		EntityManager em = EMF.get().createEntityManager();
		
		String success = "Deleted ";
		
		try {
	        
			int deletedCount = 0;
			
			/*List<SuperheroStore> allHeroes = getAllHeroes(em);
			
			try {
				em.close();
			} catch (Exception e) {
				success += e.toString();
				e.printStackTrace();
			}
			em = EMF.get().createEntityManager();
			
			for (SuperheroStore hero : allHeroes)
			{
				if (hero.getCreatedBy().equalsIgnoreCase("StanLee"))
				{
					em.remove(hero);
					deletedCount++;
				}
			}*/
			
			Query query = em.createQuery("delete from SuperheroStore o " 
	                  + "where o.createdBy = :name");
	        query.setParameter("name", "StanLee");
			deletedCount = query.executeUpdate();
			
			success += deletedCount;
	        
	    } catch (Exception e) {
	    	success = e.toString();
			e.printStackTrace();
	    } finally {
	        try {
				em.close();
			} catch (Exception e) {
				success += e.toString();
				e.printStackTrace();
			}
	    }
		
	    return "<html><head><title>JPA test</title><meta http-equiv=\"refresh\" content=\"4; url=../jpalist\" /></head><body><H1>" + success + "</H1></body></html>";
	}
	
}
