package com.devProblems;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: schema.proto")
public class BookAuthorServiceGrpc {

  private BookAuthorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.devProblems.BookAuthorService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devProblems.Author,
      com.devProblems.Author> METHOD_GET_AUTHOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.devProblems.BookAuthorService", "getAuthor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Author.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Author.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devProblems.Author,
      com.devProblems.Book> METHOD_GET_BOOKS_BY_AUTHOR =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "com.devProblems.BookAuthorService", "getBooksByAuthor"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Author.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Book.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devProblems.Book,
      com.devProblems.Book> METHOD_GET_EXPENSIVE_BOOK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "com.devProblems.BookAuthorService", "getExpensiveBook"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Book.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Book.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.devProblems.Book,
      com.devProblems.Book> METHOD_GET_BOOKS_BY_GENDER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "com.devProblems.BookAuthorService", "getBooksByGender"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Book.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.devProblems.Book.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookAuthorServiceStub newStub(io.grpc.Channel channel) {
    return new BookAuthorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookAuthorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookAuthorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BookAuthorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookAuthorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookAuthorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public void getAuthor(com.devProblems.Author request,
        io.grpc.stub.StreamObserver<com.devProblems.Author> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AUTHOR, responseObserver);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous
     *client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public void getBooksByAuthor(com.devProblems.Author request,
        io.grpc.stub.StreamObserver<com.devProblems.Book> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BOOKS_BY_AUTHOR, responseObserver);
    }

    /**
     * <pre>
     *client streaming - Asynchronous
     *client will stream of request and server will respond with one response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.devProblems.Book> getExpensiveBook(
        io.grpc.stub.StreamObserver<com.devProblems.Book> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_EXPENSIVE_BOOK, responseObserver);
    }

    /**
     * <pre>
     *bi-directional streaming - Asynchronous
     *client will send stream of request and server will respond with stream of response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.devProblems.Book> getBooksByGender(
        io.grpc.stub.StreamObserver<com.devProblems.Book> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_GET_BOOKS_BY_GENDER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AUTHOR,
            asyncUnaryCall(
              new MethodHandlers<
                com.devProblems.Author,
                com.devProblems.Author>(
                  this, METHODID_GET_AUTHOR)))
          .addMethod(
            METHOD_GET_BOOKS_BY_AUTHOR,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.devProblems.Author,
                com.devProblems.Book>(
                  this, METHODID_GET_BOOKS_BY_AUTHOR)))
          .addMethod(
            METHOD_GET_EXPENSIVE_BOOK,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.devProblems.Book,
                com.devProblems.Book>(
                  this, METHODID_GET_EXPENSIVE_BOOK)))
          .addMethod(
            METHOD_GET_BOOKS_BY_GENDER,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.devProblems.Book,
                com.devProblems.Book>(
                  this, METHODID_GET_BOOKS_BY_GENDER)))
          .build();
    }
  }

  /**
   */
  public static final class BookAuthorServiceStub extends io.grpc.stub.AbstractStub<BookAuthorServiceStub> {
    private BookAuthorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookAuthorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public void getAuthor(com.devProblems.Author request,
        io.grpc.stub.StreamObserver<com.devProblems.Author> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AUTHOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous
     *client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public void getBooksByAuthor(com.devProblems.Author request,
        io.grpc.stub.StreamObserver<com.devProblems.Book> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_BOOKS_BY_AUTHOR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming - Asynchronous
     *client will stream of request and server will respond with one response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.devProblems.Book> getExpensiveBook(
        io.grpc.stub.StreamObserver<com.devProblems.Book> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_GET_EXPENSIVE_BOOK, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *bi-directional streaming - Asynchronous
     *client will send stream of request and server will respond with stream of response.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.devProblems.Book> getBooksByGender(
        io.grpc.stub.StreamObserver<com.devProblems.Book> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_GET_BOOKS_BY_GENDER, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BookAuthorServiceBlockingStub extends io.grpc.stub.AbstractStub<BookAuthorServiceBlockingStub> {
    private BookAuthorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookAuthorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public com.devProblems.Author getAuthor(com.devProblems.Author request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AUTHOR, getCallOptions(), request);
    }

    /**
     * <pre>
     *sever streaming - Asynchronous
     *client will send one request and server will send stream of response to the client.
     * </pre>
     */
    public java.util.Iterator<com.devProblems.Book> getBooksByAuthor(
        com.devProblems.Author request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_BOOKS_BY_AUTHOR, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookAuthorServiceFutureStub extends io.grpc.stub.AbstractStub<BookAuthorServiceFutureStub> {
    private BookAuthorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookAuthorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookAuthorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookAuthorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary - synchronous
     *client will send one request and server will respond with one response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.devProblems.Author> getAuthor(
        com.devProblems.Author request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AUTHOR, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AUTHOR = 0;
  private static final int METHODID_GET_BOOKS_BY_AUTHOR = 1;
  private static final int METHODID_GET_EXPENSIVE_BOOK = 2;
  private static final int METHODID_GET_BOOKS_BY_GENDER = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookAuthorServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BookAuthorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AUTHOR:
          serviceImpl.getAuthor((com.devProblems.Author) request,
              (io.grpc.stub.StreamObserver<com.devProblems.Author>) responseObserver);
          break;
        case METHODID_GET_BOOKS_BY_AUTHOR:
          serviceImpl.getBooksByAuthor((com.devProblems.Author) request,
              (io.grpc.stub.StreamObserver<com.devProblems.Book>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EXPENSIVE_BOOK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getExpensiveBook(
              (io.grpc.stub.StreamObserver<com.devProblems.Book>) responseObserver);
        case METHODID_GET_BOOKS_BY_GENDER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getBooksByGender(
              (io.grpc.stub.StreamObserver<com.devProblems.Book>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_AUTHOR,
        METHOD_GET_BOOKS_BY_AUTHOR,
        METHOD_GET_EXPENSIVE_BOOK,
        METHOD_GET_BOOKS_BY_GENDER);
  }

}
