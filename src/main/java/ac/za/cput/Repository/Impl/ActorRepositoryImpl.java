package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Movie.Actor;
import ac.za.cput.Repository.ActorRepository;

import java.util.HashSet;
import java.util.Set;

public class ActorRepositoryImpl implements ActorRepository {

    private static ActorRepositoryImpl repository = null;
    private Set<Actor> actor = new HashSet<>();

    static ActorRepository getRepository()
    {
        if(repository == null) repository = new ActorRepositoryImpl();
        return repository;
    }

    public Actor create (Actor actor)
    {
        this.actor.add(actor);
        return actor;
    }

    public Actor read (Actor actor)
    {
        //find the student in the set and return it if it exist
        return null;
    }

    public Actor update (Actor actor)
    {
        //find the student, update it and return the updated student
        return null;
    }

    public void delete (String actor)
    {
        //find the student and delete it if it exists
    }

    public Set<Actor> getAll()
    {
        final Set<Actor> actor = this.actor;
        return actor;
    }

}
