
SUMMARY = "Low-level AMQP client for Python (fork of amqplib)."
HOMEPAGE = "http://github.com/celery/py-amqp"
AUTHOR = "Barry Pederson <pyamqp@celeryproject.org>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9d6ba772ac59c08a25a12ce15bd5f27b"

SRC_URI = "https://files.pythonhosted.org/packages/dd/a8/b00824f9be6eb4e15f565a82731c39962d71ba6e692659d22b61991b884a/amqp-5.0.6.tar.gz"
SRC_URI[md5sum] = "fd4fdda698ba8a926681e9ca1e8d2a98"
SRC_URI[sha256sum] = "03e16e94f2b34c31f8bf1206d8ddd3ccaa4c315f7f6a1879b7b1210d229568c2"

S = "${WORKDIR}/amqp-5.0.6"

RDEPENDS_${PN} = "python3-vine"

inherit setuptools3
