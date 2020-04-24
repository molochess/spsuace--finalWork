package ru.spsuace.projects.pass_fail.map;

import java.io.Closeable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Тут ничего не надо делать, просто мапа + метод close
 */
public class ClosableMap implements Map<Long, Long>, Closeable {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Long get(Object key) {
        return null;
    }

    @Override
    public Long put(Long key, Long value) {
        return null;
    }

    @Override
    public Long remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Long, ? extends Long> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Long> keySet() {
        return null;
    }

    @Override
    public Collection<Long> values() {
        return null;
    }

    @Override
    public Set<Entry<Long, Long>> entrySet() {
        return null;
    }

    public void close() {

    }
}
