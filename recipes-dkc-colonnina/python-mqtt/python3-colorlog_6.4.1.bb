
SUMMARY = "Add colours to the output of Python's logging module."
HOMEPAGE = "https://github.com/borntyping/python-colorlog"
AUTHOR = "Sam Clements <sam@borntyping.co.uk>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5c3c6ebdec7792ae12df8d1c0a46b26a"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/d6/4a/840f6cb7e922a717c765a3cdc6988aff22a6ef211d88c8d16701dfbd664f/colorlog-6.4.1.tar.gz"
SRC_URI[md5sum] = "f1b92c1cac428b2e3c9ac7edf2988440"
SRC_URI[sha256sum] = "af99440154a01f27c09256760ea3477982bf782721feaa345904e806879df4d8"

S = "${WORKDIR}/colorlog-6.4.1"

DEPENDS += " ${PYTHON_PN}-setuptools-native"
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
