
SUMMARY = "ASGI specs, helper code, and adapters"
HOMEPAGE = "https://github.com/django/asgiref/"
AUTHOR = "Django Software Foundation <foundation@djangoproject.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f09eb47206614a4954c51db8a94840fa"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/c0/9d/b1c128ed26b8c01c27e5c393c558e9c2a6716dfbdb59f97ba14960fbde76/asgiref-3.4.0.tar.gz"
SRC_URI[md5sum] = "133e985329cdae060a4dbf7380b181b0"
SRC_URI[sha256sum] = "05914d0fa65a21711e732adc6572edad6c8da5f1435c3f0c060689ced5e85195"

S = "${WORKDIR}/asgiref-3.4.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
