package com.xue.client.designpatterns.builder.lombok;

import lombok.*;

/**
 * 添加无参构造器是使用@Builder注解
 * 需要添加全参构造器（@Builder的构建者模式默认使用的是全参构造器）
 * <dependency>
 *     <groupId>org.projectlombok</groupId>
 *     <artifactId>lombok</artifactId>
 *     <optional>true</optional>
 * </dependency>
 * @Builder：作用于类上，将类转变为建造者模式
 * @Log：作用于类上，生成日志变量。针对不同的日志实现产品，有不同的注解
 * @NoArgsConstructor：生成无参构造器；
 * @RequiredArgsConstructor：生成包含final和@NonNull注解的成员变量的构造器；
 * @AllArgsConstructor：生成全参构造器
 * @Data：作用于类上，是以下注解的集合：@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
 * @EqualsAndHashCode：作用于类，覆盖默认的equals和hashCode
 * @NonNull：主要作用于成员变量和参数中，标识不能为空，否则抛出空指针异常。
 * @ToString：作用于类，覆盖默认的toString()方法，可以通过of属性限定显示某些字段，通过exclude属性排除某些字段。
 * @Getter/@Setter: 作用类上，生成所有成员变量的getter/setter方法；作用于成员变量上，生成该成员变量的getter/setter方法。可以设定访问权限及是否懒加载等。
 * @author QSNP253
 * @param <T>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Result<T> {
    private T data;
    private String code;
    private String msg;
}
