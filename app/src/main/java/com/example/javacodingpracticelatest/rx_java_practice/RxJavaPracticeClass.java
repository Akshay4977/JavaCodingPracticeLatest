package com.example.javacodingpracticelatest.rx_java_practice;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;

 public class RxJavaPracticeClass extends  AbstractDemo {


    public void video1() {
        Log.e("inside", "video1");

        Observable<Task> taskObservable = Observable.fromIterable(DataSource.createTaskList())
                .subscribeOn(Schedulers.io())
                .filter(new Predicate<Task>() {
                    @Override
                    public boolean test(Task task) throws Exception {
                        return task.isComplete();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread());

        taskObservable.subscribe(new Observer<Task>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e("inside", "->");

            }

            @Override
            public void onNext(Task task) {
                Log.e("inside", "next ->" + Thread.currentThread().getName());
                Log.e("inside", "next ->" + task.getDescription());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.e("inside", "error ->" + e.getLocalizedMessage());
            }

            @Override
            public void onComplete() {
                Log.e("inside", "onComplete ->");
            }
        });
    }

    public void videoCreateOperator(){
        Observable<Task> observable = Observable.create(new ObservableOnSubscribe<Task>() {
            @Override
            public void subscribe(ObservableEmitter<Task> emitter) throws Exception {

            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());

        observable.subscribe(new Observer<Task>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Task task) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }


     @Override
     void create() {

     }
 }
