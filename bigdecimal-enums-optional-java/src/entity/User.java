package entity;

import enumeration.SexEnum;

public record User(String name, int age, SexEnum sex) {
}
