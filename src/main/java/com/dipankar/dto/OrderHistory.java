package com.dipankar.dto;

import lombok.Data;

import java.util.List;


public class OrderHistory {
    private Long id;
    private UserDto user;
    private List<OrderDto> currentOrders;
    private int totalOrders;
    private int cancelledOrders;
    private int completedOrders;
    private int pendingOrders;

    public OrderHistory(){}

    public OrderHistory(Long id, UserDto user, List<OrderDto> currentOrders, int totalOrders, int cancelledOrders, int completedOrders, int pendingOrders) {
        this.id = id;
        this.user = user;
        this.currentOrders = currentOrders;
        this.totalOrders = totalOrders;
        this.cancelledOrders = cancelledOrders;
        this.completedOrders = completedOrders;
        this.pendingOrders = pendingOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<OrderDto> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(List<OrderDto> currentOrders) {
        this.currentOrders = currentOrders;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }

    public int getCancelledOrders() {
        return cancelledOrders;
    }

    public void setCancelledOrders(int cancelledOrders) {
        this.cancelledOrders = cancelledOrders;
    }

    public int getCompletedOrders() {
        return completedOrders;
    }

    public void setCompletedOrders(int completedOrders) {
        this.completedOrders = completedOrders;
    }

    public int getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(int pendingOrders) {
        this.pendingOrders = pendingOrders;
    }
}
