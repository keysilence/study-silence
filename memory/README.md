# 对比无值对象与有值对象占用内存空间大小的对比，结论是一样

com.silence.TestBean object internals:
 OFFSET  SIZE                TYPE DESCRIPTION                               VALUE
      0     4                     (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
      4     4                     (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
      8     4                     (object header)                           44 c0 00 f8 (01000100 11000000 00000000 11111000) (-134168508)
     12     4      java.util.List TestBean.list                             null
     16     4   java.lang.Integer TestBean.size                             null
     20     4    java.lang.String TestBean.name                             null
Instance size: 24 bytes
Space losses: 0 bytes internal + 0 bytes external = 0 bytes total

com.silence.TestBean object internals:
 OFFSET  SIZE                TYPE DESCRIPTION                               VALUE
      0     4                     (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
      4     4                     (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
      8     4                     (object header)                           44 c0 00 f8 (01000100 11000000 00000000 11111000) (-134168508)
     12     4      java.util.List TestBean.list                             (object)
     16     4   java.lang.Integer TestBean.size                             1111111111
     20     4    java.lang.String TestBean.name                             (object)
Instance size: 24 bytes
Space losses: 0 bytes internal + 0 bytes external = 0 bytes total

Disconnected from the target VM, address: '127.0.0.1:53292', transport: 'socket'

Process finished with exit code 0
