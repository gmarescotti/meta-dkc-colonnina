
SUMMARY = "Backported and Experimental Type Hints for Python 3.5+"
HOMEPAGE = "https://github.com/python/typing/blob/master/typing_extensions/README.rst"
AUTHOR = "Guido van Rossum, Jukka Lehtosalo, Łukasz Langa, Michael Lee <levkivskyi@gmail.com>"
LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/aa/55/62e2d4934c282a60b4243a950c9dbfa01ae7cac0e8d6c0b5315b87432c81/typing_extensions-3.10.0.0.tar.gz"
SRC_URI[md5sum] = "9b5b33ae64c94479fa0862cf8ae89d58"
SRC_URI[sha256sum] = "50b6f157849174217d0656f99dc82fe932884fb250826c18350e159ec6cdf342"

S = "${WORKDIR}/typing_extensions-3.10.0.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
