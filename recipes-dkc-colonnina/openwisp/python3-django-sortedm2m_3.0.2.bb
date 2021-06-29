
SUMMARY = "Drop-in replacement for django's many to many field with sorted relations."
HOMEPAGE = "http://github.com/jazzband/django-sortedm2m"
AUTHOR = "Gregor Müllegger <gregor@muellegger.de>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=894647fd647a880619497ce8da0fec32"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/5c/a8/effff3b366ef52d709f01af77f36333cc49b2f1e01f88a4b9f56441ac648/django-sortedm2m-3.0.2.tar.gz"
SRC_URI[md5sum] = "fae2bdbdde699f2ea3c374782c5b6922"
SRC_URI[sha256sum] = "8acc3638b7a2587533c7776deaa2c6c035220c8f9fff85ed67858a9c6bf51e7c"

S = "${WORKDIR}/django-sortedm2m-3.0.2"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
