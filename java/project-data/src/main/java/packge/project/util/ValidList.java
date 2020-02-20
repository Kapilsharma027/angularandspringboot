package packge.project.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.validation.Valid;

/**
 * This class is use to Validate Each List Element.
 * 
 * @param <E>
 *          elements
 * @author Kanak.Gupta
 *
 * @Since Nov 21, 2018
 */
public class ValidList<E> implements List<E> {

  @Valid
  private List<E> list;

  /**
   * Zero Parameter constructor.
   */
  public ValidList() {
    this.list = new ArrayList<E>();
  }

  /**
   * one Parameter Constructor for creating the object by passing the list.
   * 
   * @param list
   *          list
   */
  public ValidList(List<E> list) {
    this.list = list;
  }

  /**
   * to get list.
   * 
   * @return list
   */
  public List<E> getList() {
    return list;
  }

  /**
   * To set list.
   * 
   * @param list
   *          list
   */
  public void setList(List<E> list) {
    this.list = list;
  }

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public boolean contains(Object o) {

    return list.contains(o);
  }

  @Override
  public Iterator<E> iterator() {
    return list.iterator();
  }

  @Override
  public Object[] toArray() {
    return list.toArray();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return list.toArray(a);
  }

  @Override
  public boolean add(E e) {
    return list.add(e);
  }

  @Override
  public boolean remove(Object o) {
    return list.remove(o);
  }

  @Override
  public boolean containsAll(Collection<?> c) {

    return list.containsAll(c);
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    return list.addAll(c);
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    return list.addAll(index, c);
  }

  @Override
  public boolean removeAll(Collection<?> c) {

    return list.removeAll(c);
  }

  @Override
  public boolean retainAll(Collection<?> c) {

    return list.retainAll(c);
  }

  @Override
  public void clear() {
    list.clear();
  }

  @Override
  public E get(int index) {
    return list.get(index);
  }

  @Override
  public E set(int index, E element) {
    return list.set(index, element);
  }

  @Override
  public void add(int index, E element) {
    list.add(index, element);
  }

  @Override
  public E remove(int index) {
    return list.remove(index);
  }

  @Override
  public int indexOf(Object o) {
    return list.indexOf(o);
  }

  @Override
  public int lastIndexOf(Object o) {
    return list.lastIndexOf(o);
  }

  @Override
  public ListIterator<E> listIterator() {
    return list.listIterator();
  }

  @Override
  public ListIterator<E> listIterator(int index) {

    return list.listIterator(index);
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {

    return list.subList(fromIndex, toIndex);
  }

}
