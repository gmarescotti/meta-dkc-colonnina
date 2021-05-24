
SUMMARY = "Reusable django app to generate and manage x509 certificates"
HOMEPAGE = "https://github.com/openwisp/django-x509"
AUTHOR = "Federico Capoano <f.capoano@cineca.it>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=049cde5def08dc2a147ba3a3583a8813"

SRC_URI = "https://files.pythonhosted.org/packages/e9/70/46e1be0486ff800f1cc2b54c914e4f677c96f827c79ab11ea0fd949ab1d4/django-x509-0.9.4.tar.gz"
SRC_URI[md5sum] = "7c72babf8f1a5799ec56e5c8d4941866"
SRC_URI[sha256sum] = "adb74829ee7a9cea1fe0fb1b9f75f89b3a79fb0d1a55ab03952c28c5fd883e10"

S = "${WORKDIR}/django-x509-0.9.4"

RDEPENDS_${PN} = "python3-cryptography python3-django python3-jsonfield python3-openwisp-utils python3-pyopenssl python3-swapper"

inherit setuptools3
